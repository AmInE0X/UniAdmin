package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.Mapper.StudentMapper;
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

   @Autowired
    private  StudentMapper studentMapper;




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
    public Student create(StudentDTO student) {
        Student s = studentMapper.toEntity(student);
        Student s1 = studentRepo.save(s);
        return s1 ;



    }

    /**
     * @param student
     * @return
     */


    /**
     * @param student
     * @return
     */
    @Override
    public Student update(StudentDTO student,UUID s_id) {
        Student studentA = studentRepo.findById(s_id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        studentMapper.updateStudentFromDto(student, studentA);

        Student updated = studentRepo.save(studentA);

        return updated;



    }

    /**
     * @param id
     */
    @Override
    public void deleteById(UUID id) {
        studentRepo.deleteById(id);

    }

    /**
     * @return
     */
    @Override
    public List<List<Student>> findAll() {
        return List.of(
                studentRepo.findAll()
        );
    }
}
