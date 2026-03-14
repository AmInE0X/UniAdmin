package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.models.Teacher;

import java.util.List;
import java.util.UUID;

public interface CourseService {
    public List<Course> findAll();
    public Course findById(UUID id);
    public  Course create(Course course);
    public  Course update(Course course);
    public void deleteById(UUID id);


}
