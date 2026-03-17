package com.Book.Uniadmin.controllers;

import com.Book.Uniadmin.DTOs.TeacherDTO;
import com.Book.Uniadmin.Services.CourseService;
import com.Book.Uniadmin.Services.CourseServiceImp;
import com.Book.Uniadmin.Services.TeacherService;
import com.Book.Uniadmin.Services.TeacherServiceImp;
import com.Book.Uniadmin.models.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    CourseServiceImp courseService;
    @Autowired
    TeacherServiceImp teacherService;

    @PostMapping
    public Teacher create(@RequestBody TeacherDTO teacher) {
        return teacherService.create(teacher) ;

    }
    @GetMapping
    public List<Teacher> getAll(){
        return teacherService.findAll();
    }
    @PutMapping("{id}")
    public Teacher update(@PathVariable UUID id, @RequestBody TeacherDTO teacher) {
        return teacherService.update(teacher,id);
    }

}
