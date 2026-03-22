package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.DTOs.CourseDTO;
import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.models.Teacher;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface CourseService {
    public List<Course> findAll();
    public Page<Course> findAll(Pageable pageable);
    public Course findById(UUID id);
    public  Course create(CourseDTO course);
    public  Course update(CourseDTO course, UUID id);
    public void deleteById(UUID id);


}
