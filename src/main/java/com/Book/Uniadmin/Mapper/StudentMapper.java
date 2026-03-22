package com.Book.Uniadmin.Mapper;

import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.models.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
@Mapper(componentModel = "spring")
public interface StudentMapper {

    @org.mapstruct.Mapping(source = "department.name", target = "departmentName")
    StudentDTO toDTO(Student student);

    @org.mapstruct.Mapping(target = "id", ignore = true)
    @org.mapstruct.Mapping(target = "department", ignore = true)
    Student toEntity(StudentDTO student);

    @org.mapstruct.Mapping(target = "id", ignore = true)
    @org.mapstruct.Mapping(target = "department", ignore = true)
    void updateStudentFromDto(StudentDTO dto,
                              @MappingTarget Student student);
}