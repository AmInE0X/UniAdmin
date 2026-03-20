package com.Book.Uniadmin.Mapper;

import com.Book.Uniadmin.DTOs.CourseDTO;
import com.Book.Uniadmin.models.Course;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CourseMapper {
        @org.mapstruct.Mapping(source = "professor.name", target = "professorName")
        CourseDTO toDTO(Course course);

        @org.mapstruct.Mapping(target = "id", ignore = true)
        @org.mapstruct.Mapping(target = "professor", ignore = true)
        @org.mapstruct.Mapping(target = "credits", ignore = true)
        Course toEntity(CourseDTO course);

        @org.mapstruct.Mapping(target = "id", ignore = true)
        @org.mapstruct.Mapping(target = "professor", ignore = true)
        @org.mapstruct.Mapping(target = "credits", ignore = true)
        void updateCourseFromDto(CourseDTO dto,
                                 @MappingTarget Course course);

    }

