package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.models.Student;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    public List<Course> findByName(String name);
    public Student findById(UUID id);
    public Student create(Student student);
    public Student update(Student student);
    public void deleteById(UUID id);
    public List<Student> findAll();

}
