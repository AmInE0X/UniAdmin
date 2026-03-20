package com.Book.Uniadmin.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {

    private UUID id ;
    private String name ;
    private String college;
    private String category;
    private String head;
    private String headAvatar;
    private String description;
    private String avatar;
    private int facultyCount;
    private int studentCount;
}
