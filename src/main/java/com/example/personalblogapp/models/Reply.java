package com.example.personalblogapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reply {
    @Id
    private long id;

    private String body;


}
