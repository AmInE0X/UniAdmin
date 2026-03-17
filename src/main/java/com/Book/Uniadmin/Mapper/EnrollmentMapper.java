package com.Book.Uniadmin.Mapper;

import com.Book.Uniadmin.DTOs.EnrollDTO;
import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.models.Enrollment;
import com.Book.Uniadmin.models.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EnrollmentMapper {
    @Mapping(source = "student.id", target = "studentId")
    @Mapping(source = "course.id", target = "courseId")
    @Mapping(source = "student.name", target = "studentName")
    @Mapping(source = "course.title", target = "courseTitle")
    EnrollDTO toDTO(Enrollment enrollment);


}
