package com.Book.Uniadmin.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentDTO {
    public class StudentRequest {

        private String name;
        private String email;
        private String phone;
        private String address;
        private String department;
        private String status;
        private int year;

        // getters setters
    }
}
