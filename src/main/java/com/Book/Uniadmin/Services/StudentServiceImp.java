package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.models.Student;
import com.Book.Uniadmin.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class StudentServiceImp implements StudentService{

    /**
     * @param name
     * @return
     */
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Course> findByName(String name) {
        return List.of();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Student findById(UUID id) {
        return null;
    }

    /**
     * @param student
     * @return
     */
    @Override
    public Student create(Student student) {
        Student newStudent = new Student();
        newStudent.setId(student.getId());
        newStudent.setName(student.getName());
        newStudent.setEmail(student.getEmail());
        newStudent.setPhone(student.getPhone());
        newStudent.setAddress(student.getAddress());
        newStudent.setDepartment(student.getDepartment());
        newStudent.setStatus(student.getStatus());
        newStudent.setYear(student.getYear());






        return studentRepo.save(newStudent);
    }

    /**
     * @param student
     * @return
     */
    @Override
    public Student update(Student student) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void deleteById(UUID id) {

    }

    /**
     * @return
     */
    @Override
    public List<Student> findAll() {
        return List.of();
    }
}
