package com.Book.Uniadmin.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student extends Person {
    private String student_number;

    @Embedded
    private Adress address;
    @ManyToOne
    private Department department;
    private String year;
    private Status status ;



}
