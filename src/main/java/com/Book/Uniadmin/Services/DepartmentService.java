package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.DTOs.DepartmentDTO;
import com.Book.Uniadmin.models.Department;
import com.Book.Uniadmin.models.Teacher;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface DepartmentService {
    public Department createDepartment(DepartmentDTO department);
    public Department getDepartmentById(UUID id);
    public void deleteDepartment(UUID id);
    public List<Department> getAllDepartments();
    public Page<Department> getAllDepartments(Pageable pageable);
    public List<Teacher> getAllTeachersByDepartment(UUID id);

}
