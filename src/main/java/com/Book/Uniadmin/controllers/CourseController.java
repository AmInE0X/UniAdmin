package com.Book.Uniadmin.controllers;

import com.Book.Uniadmin.DTOs.CourseDTO;
import com.Book.Uniadmin.Services.CourseService;
import com.Book.Uniadmin.Services.CourseServiceImp;
import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.Mapper.CourseMapper;
import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("Course")
public class CourseController {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CourseServiceImp courseService;

    @GetMapping
    public ApiResponse<List<CourseDTO>> get(){
        List<CourseDTO> dtos = courseService.findAll().stream()
                .map(courseMapper::toDTO).toList();
        return ApiResponse.success(dtos);

    }
    @PostMapping
    public ApiResponse<CourseDTO> save(@RequestBody CourseDTO course){
        Course saved = courseService.create(course);
        return ApiResponse.success(courseMapper.toDTO(saved));
    }
    @PutMapping("/{id}")
    public ApiResponse<CourseDTO> update(@RequestBody CourseDTO course, @PathVariable UUID id){
        Course updated = courseService.update(course, id);
        return ApiResponse.success(courseMapper.toDTO(updated));
    }
    @DeleteMapping("/{id}")
    public ApiResponse<String> delete(@PathVariable UUID id){
        courseService.deleteById(id);
        return ApiResponse.success("Course deleted successfully");
    }
}
