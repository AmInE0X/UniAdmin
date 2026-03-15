package com.Book.Uniadmin.Mapper;


import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.DTOs.TeacherDTO;
import com.Book.Uniadmin.models.Student;
import com.Book.Uniadmin.models.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface TeacherMapper {
    TeacherDTO toDTO(Teacher teacher);
    Teacher toEntity(TeacherDTO teacherDTO);
    void updateTeacherFromDto(TeacherDTO dto,
                              @MappingTarget Teacher teacher);


}
