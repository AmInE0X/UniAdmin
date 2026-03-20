package com.Book.Uniadmin.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CourseDTO {
    private UUID id;
    private String  title;
    private String code;
    private String description;
    private int credits;
    private String professorName;
    private String colorTheme;
    private String icon;
}
