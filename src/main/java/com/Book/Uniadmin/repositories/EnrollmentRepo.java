package com.Book.Uniadmin.repositories;

import com.Book.Uniadmin.models.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnrollmentRepo extends JpaRepository<Enrollment, UUID> {
    void deleteById_CourseId(UUID courseId);
}
