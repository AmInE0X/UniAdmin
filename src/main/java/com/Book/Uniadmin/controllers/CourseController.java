package com.Book.Uniadmin.controllers;

import com.Book.Uniadmin.DTOs.CourseDTO;
import com.Book.Uniadmin.Services.CourseService;
import com.Book.Uniadmin.models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping
    public List<List<Course>> get(){
        return courseService.findAll();

    }
    @PostMapping
    public Course save(@RequestBody CourseDTO course){
        return courseService.create(course);

    }
    @PutMapping
    public Course update(@RequestBody CourseDTO course, @PathVariable UUID id){
        return courseService.update(course, id);
    }
    @DeleteMapping
    public void delete(@PathVariable UUID id){
        courseService.deleteById(id);
    }
}
