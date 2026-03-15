package com.Book.Uniadmin.controllers;

import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.Services.StudentService;
import com.Book.Uniadmin.models.Student;
import com.Book.Uniadmin.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("Student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public Student create(@RequestBody StudentDTO student) {
        return studentService.create(student);
    }
    @PutMapping("{id}")
    public Student update(@RequestBody StudentDTO student ,@PathVariable UUID id) {
        return studentService.update(student, id);


    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable UUID id) {
        studentService.deleteById(id);
    }
}
