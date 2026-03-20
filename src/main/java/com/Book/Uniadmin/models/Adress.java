package com.Book.Uniadmin.models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Adress {
    private String city;
    private String street;
    private String code_postal;



}
