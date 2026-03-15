package com.Book.Uniadmin.Mapper;

import com.Book.Uniadmin.DTOs.CourseDTO;
import com.Book.Uniadmin.models.Course;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CourseMapper {


        CourseDTO toDTO(Course course);

        Course toEntity(CourseDTO course);
        void updateCourseFromDto(CourseDTO dto,
                                 @MappingTarget Course course);

    }

