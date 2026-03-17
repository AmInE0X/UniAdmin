package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.DTOs.CourseDTO;
import com.Book.Uniadmin.Mapper.CourseMapper;
import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.repositories.CoursesRepo;
import com.Book.Uniadmin.repositories.TeacherRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    private CoursesRepo coursesRepo;

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private TeacherRep teacherRep;

    @Override
    public List<Course> findAll() {
        return coursesRepo.findAll();
    }

    @Override
    public Course findById(UUID id) {
        return coursesRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));
    }

    @Override
    public Course create(CourseDTO course) {

        Course entity = courseMapper.toEntity(course);

        return coursesRepo.save(entity);
    }

    @Override
    public Course update(CourseDTO course, UUID id) {

        Course entity = coursesRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        courseMapper.updateCourseFromDto(course, entity);

        return coursesRepo.save(entity);
    }

    @Override
    public void deleteById(UUID id) {

        coursesRepo.deleteById(id);
    }




}
