package com.Book.Uniadmin.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Department {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String college;
    private String category;
    private String head;
    private String headAvatar;
    private String description;
    private String avatar;

    @OneToMany(mappedBy = "department")
    private List<Teacher> Teachers;

}
