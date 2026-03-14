package com.Book.Uniadmin.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private int credits;

    @ManyToOne
    private Teacher professor;

}
