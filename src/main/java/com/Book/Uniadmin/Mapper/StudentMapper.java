package com.Book.Uniadmin.Mapper;

import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.models.Student;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface StudentMapper {


       StudentDTO toDTO(Student student);
        Student toEntity(StudentDTO student);
    void updateStudentFromDto(StudentDTO dto,
                              @MappingTarget Student student);

    }

