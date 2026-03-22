package com.Book.Uniadmin.controllers;

import com.Book.Uniadmin.DTOs.CourseDTO;
import com.Book.Uniadmin.Services.CourseServiceImp;
import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.Mapper.CourseMapper;
import com.Book.Uniadmin.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("Course")
public class CourseController {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CourseServiceImp courseService;

    @GetMapping("all")
    public ApiResponse<List<CourseDTO>> getAll() {
        List<CourseDTO> dtos = courseService.findAll().stream()
                .map(courseMapper::toDTO).toList();
        return ApiResponse.success(dtos);
    }

    @GetMapping
    public ApiResponse<Page<CourseDTO>> get(Pageable pageable){
        Page<CourseDTO> dtos = courseService.findAll(pageable)
                .map(courseMapper::toDTO);
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
    @GetMapping("/{id}")
    public ApiResponse<CourseDTO> getById(@PathVariable UUID id){
        Course course = courseService.findById(id);
        return ApiResponse.success(courseMapper.toDTO(course));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<String> delete(@PathVariable UUID id){
        courseService.deleteById(id);
        return ApiResponse.success("Course deleted successfully");
    }
}
