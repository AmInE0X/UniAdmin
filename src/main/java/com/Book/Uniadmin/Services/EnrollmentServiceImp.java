package com.Book.Uniadmin.Services;

import com.Book.Uniadmin.DTOs.EnrollDTO;
import com.Book.Uniadmin.Mapper.EnrollmentMapper;
import com.Book.Uniadmin.models.Enrollment;
import com.Book.Uniadmin.repositories.EnrollmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class EnrollmentServiceImp implements EnrollmentService {
    /**
     * @param id
     * @return
     */
    @Autowired
    private EnrollmentRepo enrollmentRepo;
    @Autowired
    private EnrollmentMapper enrollmentmapper;
    @Override
    public Enrollment findById(UUID id) {
        return null;
    }

    /**
     * @param enrollment
     * @return
     */
    @Override
    public Enrollment enroll(EnrollDTO enrollment) {
        return null;
    }
}
