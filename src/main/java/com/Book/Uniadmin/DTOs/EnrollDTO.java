package com.Book.Uniadmin.DTOs;

import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.models.Enrollment;
import com.Book.Uniadmin.models.EnrollmentId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnrollDTO {

    private UUID courseId;
    private UUID studentId;
    private String studentName;
    private String CourseTitle ;


    private LocalDate enrollmentDate;

    private Double grade;




}
