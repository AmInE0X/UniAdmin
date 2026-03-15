package com.Book.Uniadmin.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CourseDTO {
    private String  title;
    private int credits;
    TeacherDTO teacher;


}
