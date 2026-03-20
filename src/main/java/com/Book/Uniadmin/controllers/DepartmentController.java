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
