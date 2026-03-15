package com.Book.Uniadmin.DTOs;

import com.Book.Uniadmin.models.Adress;
import com.Book.Uniadmin.models.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentDTO {
                private String name;
                private String email;
                private String phone;
                private Adress address;
                private String department;
                private String status;
                private int year;


        }



        // getters setters


