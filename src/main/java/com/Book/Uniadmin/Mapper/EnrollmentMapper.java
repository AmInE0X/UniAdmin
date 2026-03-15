package com.Book.Uniadmin.Mapper;

import com.Book.Uniadmin.DTOs.EnrollDTO;
import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.models.Enrollment;
import com.Book.Uniadmin.models.Student;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EnrollmentMapper {
    Enrollment  toEntity(EnrollDTO enrollment);
    EnrollDTO toDTO(Enrollment enrollment);
    void updateEnrollmentFromDto(EnrollDTO dto,
                              @MappingTarget Enrollment enrollment);


}
