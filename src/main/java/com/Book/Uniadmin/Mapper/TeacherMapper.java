package com.Book.Uniadmin.Mapper;


import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.DTOs.TeacherDTO;
import com.Book.Uniadmin.models.Student;
import com.Book.Uniadmin.models.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface TeacherMapper {
    @org.mapstruct.Mapping(source = "department.name", target = "departmentName")
    TeacherDTO toDTO(Teacher teacher);

    @org.mapstruct.Mapping(target = "id", ignore = true)
    @org.mapstruct.Mapping(target = "department", ignore = true)
    Teacher toEntity(TeacherDTO teacherDTO);

    @org.mapstruct.Mapping(target = "id", ignore = true)
    @org.mapstruct.Mapping(target = "department", ignore = true)
    void updateTeacherFromDto(TeacherDTO dto,
                              @MappingTarget Teacher teacher);


}
