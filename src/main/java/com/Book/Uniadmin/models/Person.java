package com.Book.Uniadmin.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String email;
    private String phone;

}
