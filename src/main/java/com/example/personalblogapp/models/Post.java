package com.example.personalblogapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Post {
    @Id
    private long id;

    private List<Reply> replies;
}
