package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.DTOs.DepartmentDTO;
import com.Book.Uniadmin.Mapper.DepartmentMapper;
import com.Book.Uniadmin.models.Department;
import com.Book.Uniadmin.models.Teacher;
import com.Book.Uniadmin.repositories.DepartmentRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;
@Service
public class DepartmentServiceImp implements DepartmentService {
    /**
     * @param department
     * @return
     */
    @Autowired
    private DepartmentRepo departmentRepo;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public Department createDepartment(DepartmentDTO department) {
        Department newDepartment = departmentMapper.toEntity(department);
        return departmentRepo.save(newDepartment);

    }

    /**
     * @param id
     * @return
     */
    @Override
    public Department getDepartmentById(UUID id) {

        return departmentRepo.findById(id).orElseThrow(()-> new RuntimeException("entity not found"));
    }

    /**
     * @param id
     */
    @Override
    public void deleteDepartment(UUID id) {
        departmentRepo.deleteById(id);

    }

    /**
     * @return
     */
    @Override
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }

    @Override
    public Page<Department> getAllDepartments(Pageable pageable) {
        return departmentRepo.findAll(pageable);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public List<Teacher> getAllTeachersByDepartment(UUID id) {
        Department department = getDepartmentById(id);
        return department.getTeachers();


    }

}
