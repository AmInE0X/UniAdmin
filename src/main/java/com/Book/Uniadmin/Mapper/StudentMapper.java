package com.Book.Uniadmin.Mapper;

import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.models.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
@Mapper(componentModel = "spring")
public interface StudentMapper {

    @org.mapstruct.Mapping(source = "department.id", target = "departmentId")
    StudentDTO toDTO(Student student);

    @org.mapstruct.Mapping(source = "departmentId", target = "department.id")
    @org.mapstruct.Mapping(target = "id", ignore = true)
    @org.mapstruct.Mapping(target = "studentNumber", ignore = true)
    Student toEntity(StudentDTO student);

    @org.mapstruct.Mapping(source = "departmentId", target = "department.id")
    @org.mapstruct.Mapping(target = "id", ignore = true)
    @org.mapstruct.Mapping(target = "studentNumber", ignore = true)
    @org.mapstruct.Mapping(target = "department", ignore = true)
    void updateStudentFromDto(StudentDTO dto,
                              @MappingTarget Student student);
}