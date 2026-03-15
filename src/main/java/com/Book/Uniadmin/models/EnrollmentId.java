package com.Book.Uniadmin.models;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class EnrollmentId implements Serializable {
    private UUID studentId;
    private UUID courseId;





    //TODO [Reverse Engineering] generate columns from DB
}