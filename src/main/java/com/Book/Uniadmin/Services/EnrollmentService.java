package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.models.Enrollment;
import com.Book.Uniadmin.models.Student;

import java.time.LocalDate;
import java.util.UUID;

public interface EnrollmentService {
    public Enrollment findById(UUID id);
    public Enrollment enroll(Student student , Course course , LocalDate enrollmentDate , Double grade );




}
