package com.Book.Uniadmin.controllers;

import com.Book.Uniadmin.DTOs.EnrollDTO;
import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.Services.EnrollmentService;
import com.Book.Uniadmin.Services.EnrollmentServiceImp;
import com.Book.Uniadmin.Services.StudentService;
import com.Book.Uniadmin.Services.StudentServiceImp;
import com.Book.Uniadmin.models.Enrollment;
import com.Book.Uniadmin.models.Student;
import com.Book.Uniadmin.repositories.StudentRepo;
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
@GetMapping
public List<Student> getALL(){
    return studentService.findAll();
}
    @PostMapping
    public Student create(@RequestBody StudentDTO student) {
        return studentService.create(student);
    }
    @PutMapping("{id}")
    public Student update(@RequestBody StudentDTO student ,@PathVariable UUID id) {
        return studentService.update(student, id);


    }
    @PostMapping("enroll")
    public Enrollment createEnrollment(@RequestBody EnrollDTO enrollment) {
        return enrollmentService.enroll(enrollment);

    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable UUID id) {
        studentService.deleteById(id);
    }
}
