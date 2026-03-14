package com.Book.Uniadmin.repositories;

import com.Book.Uniadmin.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeacherRep extends JpaRepository<Teacher, UUID> {
}
