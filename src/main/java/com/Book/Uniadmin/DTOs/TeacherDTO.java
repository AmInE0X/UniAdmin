package com.Book.Uniadmin.DTOs;

import com.Book.Uniadmin.models.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TeacherDTO {

        private String  name ;
        private String  email ;
        private String  phone;
        private String employeeId ;
        private UUID departmentId ;





}
