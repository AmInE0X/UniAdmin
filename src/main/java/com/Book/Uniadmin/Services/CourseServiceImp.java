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
public class CourseServiceImp implements CourseService{
    /**
     * @return
     */
    @Autowired
    private CoursesRepo  coursesRepo;
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private TeacherRep teacherRep;

    @Override
    public List<List<Course>> findAll() {
        return List.of();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Course findById(UUID id) {
        return null;
    }

    /**
     * @param course
     * @return
     */
    @Override
    public Course create(CourseDTO course) {
        Course toEntity = courseMapper.toEntity(course);
        Course c1=coursesRepo.save(toEntity);

        return c1;
    }

    /**
     * @param course
     * @return
     */
    @Override
    public Course update(CourseDTO course, UUID id) {
        Course S=coursesRepo.findById(id).orElse(null);
        courseMapper.updateCourseFromDto(course,S);
       return coursesRepo.save(S);

    }

    /**
     * @param id
     */
    @Override
    public void deleteById(UUID id) {
        coursesRepo.deleteById(id);

    }





}
