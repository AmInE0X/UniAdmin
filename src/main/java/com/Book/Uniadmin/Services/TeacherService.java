package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.DTOs.TeacherDTO;
import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.models.Teacher;

import java.util.List;
import java.util.UUID;

public interface TeacherService {
    public List<Teacher>findAll();
    public Teacher findById(UUID id);
    public  Teacher create(TeacherDTO teacher);
    public  Teacher update(TeacherDTO teacher , UUID id);
    public void deleteById(UUID id);



}
