package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.DTOs.CourseDTO;
import com.Book.Uniadmin.Mapper.CourseMapper;
import com.Book.Uniadmin.models.Course;
import com.Book.Uniadmin.repositories.CoursesRepo;
import com.Book.Uniadmin.repositories.TeacherRep;
import com.Book.Uniadmin.repositories.EnrollmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
@Service
@Transactional
public class CourseServiceImp implements CourseService {

    @Autowired
    private CoursesRepo coursesRepo;

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private TeacherRep teacherRep;

    @Autowired
    private EnrollmentRepo enrollmentRepo;

    @Override
    public List<Course> findAll() {
        return coursesRepo.findAll();
    }

    @Override
    public Page<Course> findAll(Pageable pageable) {
        return coursesRepo.findAll(pageable);
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
        enrollmentRepo.deleteById_CourseId(id);
        coursesRepo.deleteById(id);
    }




}
