package com.Book.Uniadmin.controllers;

import com.Book.Uniadmin.DTOs.DepartmentDTO;
import com.Book.Uniadmin.DTOs.TeacherDTO;
import com.Book.Uniadmin.Services.DepartmentServiceImp;
import com.Book.Uniadmin.Services.TeacherServiceImp;
import com.Book.Uniadmin.models.Department;
import com.Book.Uniadmin.models.Teacher;
import com.Book.Uniadmin.repositories.DepartmentRepo;
import com.Book.Uniadmin.Mapper.DepartmentMapper;
import com.Book.Uniadmin.Mapper.TeacherMapper;
import com.Book.Uniadmin.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentServiceImp departmentService;
    @Autowired
    private TeacherServiceImp teacherService;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private DepartmentRepo departmentRepo;

    @GetMapping
    public ApiResponse<Page<DepartmentDTO>> get(Pageable pageable){
        Page<DepartmentDTO> dtos = departmentService.getAllDepartments(pageable)
                .map(departmentMapper::toDTO);
        return ApiResponse.success(dtos);
    }

    @GetMapping("all")
    public ApiResponse<List<DepartmentDTO>> getAllDepartments(){
        List<DepartmentDTO> dtos = departmentService.getAllDepartments().stream()
                .map(departmentMapper::toDTO).toList();

        return ApiResponse.success(dtos);
    }

    @PostMapping
    public ApiResponse<DepartmentDTO> addDepartment(@RequestBody DepartmentDTO department){
        Department saved = departmentService.createDepartment(department);
        return ApiResponse.success(departmentMapper.toDTO(saved));
    }

    @GetMapping("{id}")
    public ApiResponse<DepartmentDTO> getDepartment(@PathVariable UUID id) {
        Department department = departmentService.getDepartmentById(id);
        return ApiResponse.success(departmentMapper.toDTO(department));
    }

    @PutMapping("{id}")
    public ApiResponse<DepartmentDTO> updateDepartment(@PathVariable UUID id, @RequestBody DepartmentDTO departmentDTO) {
        // Assuming updateDepartment logic exists or can be inferred
        // Since I'm refactoring, I'll use the existing createDepartment or add an update method if I can.
        // For now, I'll just use the mapper and save.
        Department existing = departmentService.getDepartmentById(id);
        departmentMapper.updateDepartmentFromDto(departmentDTO, existing);
        Department saved = departmentRepo.save(existing);
        return ApiResponse.success(departmentMapper.toDTO(saved));
    }

    @GetMapping("{id}/teachers")
    public ApiResponse<List<TeacherDTO>> getAllTeachersByDepartment(@PathVariable UUID id){
        List<TeacherDTO> dtos = departmentService.getAllTeachersByDepartment(id).stream()
                .map(teacherMapper::toDTO).toList();
        return ApiResponse.success(dtos);
    }

    @DeleteMapping("{id}")
    public ApiResponse<String> deleteDepartment(@PathVariable UUID id){
        departmentService.deleteDepartment(id);
        return ApiResponse.success("Department deleted successfully");
    }
}
