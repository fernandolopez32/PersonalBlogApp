package com.example.personalblogapp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String body;

    @ManyToOne
    @JsonBackReference
    private User user;

    @ManyToOne
    private Post post;

    public Comment() {
    }

    public Comment(String body) {
        this.body = body;
    }

    public Comment(long id, String body) {
        this.id = id;
        this.body = body;
    }

//    getters and setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
