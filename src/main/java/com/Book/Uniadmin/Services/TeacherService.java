package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.DTOs.TeacherDTO;
import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.models.Teacher;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface TeacherService {
    public List<Teacher>findAll();
    public Page<Teacher> findAll(Pageable pageable);
    public Teacher findById(UUID id);
    public  Teacher create(TeacherDTO teacher);
    public  Teacher update(TeacherDTO teacher , UUID id);
    public void deleteById(UUID id);



}
