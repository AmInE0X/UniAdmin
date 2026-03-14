package com.Book.Uniadmin.DTOs;

import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.models.Student;

import java.time.LocalDate;

public record EnrollDTO() {
    private static Student student ;
    private static Course course ;
    private static LocalDate enrollmentDate ;

}
