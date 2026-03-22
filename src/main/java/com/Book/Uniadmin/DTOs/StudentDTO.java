package com.Book.Uniadmin.DTOs;

import com.Book.Uniadmin.models.Adress;
import com.Book.Uniadmin.models.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentDTO {
                private UUID id;
                private String student_number;
                private String name;
                private String email;
                private String phone;
                private Adress address;
                private String departmentName;
                private String status;
                private String year;
                private String avatar;


        }



        // getters setters


