package com.Book.Uniadmin.controllers;

import com.Book.Uniadmin.DTOs.TeacherDTO;
import com.Book.Uniadmin.Services.CourseService;
import com.Book.Uniadmin.Services.CourseServiceImp;
import com.Book.Uniadmin.Services.TeacherService;
import com.Book.Uniadmin.Services.TeacherServiceImp;
import com.Book.Uniadmin.Mapper.TeacherMapper;
import com.Book.Uniadmin.models.Teacher;
import com.Book.Uniadmin.responses.ApiResponse;
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
    @Autowired
    TeacherMapper teacherMapper;

    @PostMapping
    public ApiResponse<TeacherDTO> create(@RequestBody TeacherDTO teacher) {
        Teacher saved = teacherService.create(teacher);
        return ApiResponse.success(teacherMapper.toDTO(saved));
    }
    @GetMapping
    public ApiResponse<List<TeacherDTO>> getAll(){
        List<TeacherDTO> dtos = teacherService.findAll().stream()
                .map(teacherMapper::toDTO).toList();
        return ApiResponse.success(dtos);
    }
    @PutMapping("{id}")
    public ApiResponse<TeacherDTO> update(@PathVariable UUID id, @RequestBody TeacherDTO teacher) {
        Teacher updated = teacherService.update(teacher,id);
        return ApiResponse.success(teacherMapper.toDTO(updated));
    }

}
