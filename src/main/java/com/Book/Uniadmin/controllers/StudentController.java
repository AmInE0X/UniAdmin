package com.Book.Uniadmin.controllers;

import com.Book.Uniadmin.DTOs.EnrollDTO;
import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.Services.EnrollmentService;
import com.Book.Uniadmin.Services.EnrollmentServiceImp;
import com.Book.Uniadmin.Services.StudentService;
import com.Book.Uniadmin.Services.StudentServiceImp;
import com.Book.Uniadmin.models.Enrollment;
import com.Book.Uniadmin.models.Student;
import com.Book.Uniadmin.models.Student;
import com.Book.Uniadmin.repositories.StudentRepo;
import com.Book.Uniadmin.Mapper.StudentMapper;
import com.Book.Uniadmin.Mapper.EnrollmentMapper;
import com.Book.Uniadmin.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("Student")
public class StudentController {
    @Autowired
    private StudentServiceImp studentService;
    @Autowired
    private EnrollmentServiceImp enrollmentService;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private EnrollmentMapper enrollmentMapper;

    @GetMapping
    public ApiResponse<List<StudentDTO>> getALL(){
        List<StudentDTO> dtos = studentService.findAll().stream()
                .map(studentMapper::toDTO).toList();
        return ApiResponse.success(dtos);
    }
    @PostMapping
    public ApiResponse<StudentDTO> create(@RequestBody StudentDTO student) {
        Student saved = studentService.create(student);
        return ApiResponse.success(studentMapper.toDTO(saved));
    }
    @PutMapping("{id}")
    public ApiResponse<StudentDTO> update(@RequestBody StudentDTO student ,@PathVariable UUID id) {
        Student updated = studentService.update(student, id);
        return ApiResponse.success(studentMapper.toDTO(updated));
    }
    @PostMapping("enroll")
    public ApiResponse<EnrollDTO> createEnrollment(@RequestBody EnrollDTO enrollment) {
        Enrollment saved = enrollmentService.enroll(enrollment);
        return ApiResponse.success(enrollmentMapper.toDTO(saved));
    }
    @DeleteMapping("{id}")
    public ApiResponse<String> delete(@PathVariable UUID id) {
        studentService.deleteById(id);
        return ApiResponse.success("Student deleted successfully");
    }
}
