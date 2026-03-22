package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.DTOs.EnrollDTO;
import com.Book.Uniadmin.Mapper.EnrollmentMapper;
import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.models.Enrollment;
import com.Book.Uniadmin.models.Student;
import com.Book.Uniadmin.repositories.CoursesRepo;
import com.Book.Uniadmin.repositories.EnrollmentRepo;
import com.Book.Uniadmin.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Book.Uniadmin.models.EnrollmentId;
import java.util.UUID;
@Service
public class EnrollmentServiceImp implements EnrollmentService {
    /**
     * @param id
     * @return
     */
    @Autowired
    private EnrollmentRepo enrollmentRepo;
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private CoursesRepo  coursesRepo;
    @Autowired
    private EnrollmentMapper enrollmentmapper;
    @Override
    public Enrollment findById(UUID id) {
        return enrollmentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Enrollment not found"));
    }

    /**
     * @param enrollment
     * @return
     */
    @Override
    public Enrollment enroll(EnrollDTO enrollment) {

        Student student = studentRepo.findById(enrollment.getStudentId())
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Course course = coursesRepo.findById(enrollment.getCourseId())
                .orElseThrow(() -> new RuntimeException("Course not found"));

        Enrollment enrollment1 = new Enrollment();
        
        // Initialize the composite ID
        EnrollmentId enrollmentId = new EnrollmentId(student.getId(), course.getId());
        enrollment1.setId(enrollmentId);
        
        enrollment1.setStudent(student);
        enrollment1.setCourse(course);
        enrollment1.setEnrollmentDate(enrollment.getEnrollmentDate());

        return enrollmentRepo.save(enrollment1);

    }
}
