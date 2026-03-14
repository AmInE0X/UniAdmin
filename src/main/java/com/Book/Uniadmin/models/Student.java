package com.Book.Uniadmin.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Student extends Person {
    private String studentNumber;

    @Embedded
    private Adress address;
    @ManyToOne
    private Department department;
    private String Year;
    private String Status ;





}
