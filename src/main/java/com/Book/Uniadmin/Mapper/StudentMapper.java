package com.Book.Uniadmin.Mapper;

import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.models.Student;
import org.mapstruct.Mapper;


    @Mapper(componentModel = "spring")
    public interface StudentMapper {

        Student toEntity(StudentDTO.StudentRequest dto);

    }

