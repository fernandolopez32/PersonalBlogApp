package com.example.personalblogapp.repositories;

import com.example.personalblogapp.models.Post;
import com.example.personalblogapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository <Post, Long> {
    Post findById(long id);
    Post findByUser(User user);

}
