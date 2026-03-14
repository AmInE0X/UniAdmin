package com.Book.Uniadmin.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.UUID;


@Entity
public class Course {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;

    private int credits;

    @ManyToOne
    private Teacher professor;

}
