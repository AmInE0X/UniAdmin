package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.models.Teacher;

import java.util.List;
import java.util.UUID;

public interface TeacherService {
    public List<Teacher> findAll();
    public Teacher findById(UUID id);
    public  Teacher create(Teacher teacher);
    public  Teacher update(Teacher teacher);
    public void deleteById(UUID id);



}
