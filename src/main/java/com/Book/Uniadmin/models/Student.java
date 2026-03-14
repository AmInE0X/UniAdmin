package com.Book.Uniadmin.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
public class Student extends Person {
    private long studentNumber;

    @Embedded
    private Adress address;
    @ManyToOne
    private Department department;
    private String Year;
    private Status Status ;






}
