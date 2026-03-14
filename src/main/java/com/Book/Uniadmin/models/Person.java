package com.Book.Uniadmin.models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;
    private String phone;

}
