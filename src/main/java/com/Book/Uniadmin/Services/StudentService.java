package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.models.Student;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    public List<Course> findByName(String name);
    public Student findById(UUID id);
    public Student create(StudentDTO student);


    public Student update(StudentDTO student,UUID s_id);
    public void deleteById(UUID id);
    public List<List<Student>> findAll();

}
