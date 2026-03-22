package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.DTOs.TeacherDTO;
import com.Book.Uniadmin.Mapper.TeacherMapper;
import com.Book.Uniadmin.models.Teacher;
import com.Book.Uniadmin.repositories.TeacherRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;
@Service
public class TeacherServiceImp implements TeacherService{
    /**
     * @return
     */

    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private TeacherRep teacherRepo;

    @Override
    public List<Teacher> findAll() {
        return teacherRepo.findAll();
    }

    @Override
    public Page<Teacher> findAll(Pageable pageable) {
        return teacherRepo.findAll(pageable);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Teacher findById(UUID id) {
        return teacherRepo.findById(id).orElseThrow(() -> new RuntimeException("Teacher not found with id: " + id));
    }

    /**
     * @param teacher
     * @return
     */
    @Override
    public Teacher create(TeacherDTO teacher) {
        Teacher teacher1 = teacherMapper.toEntity(teacher);
        Teacher t =teacherRepo.save(teacher1);

        return t;
    }

    /**
     * @param teacher
     * @return
     */
    @Override
    public Teacher update(TeacherDTO teacher,UUID id) {
        Teacher t=teacherRepo.findById(id).orElseThrow(()->new RuntimeException("entity not found"));
        teacherMapper.updateTeacherFromDto(teacher,t);

        teacherRepo.save(t);
        return t;
    }

    /**
     * @param id
     */
    @Override
    public void deleteById(UUID id) {
        teacherRepo.deleteById(id);

    }
}
