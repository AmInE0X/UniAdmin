package com.Book.Uniadmin.repositories;

import com.Book.Uniadmin.DTOs.StudentDTO;
import com.Book.Uniadmin.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface StudentRepo extends JpaRepository<Student, UUID> {



}
