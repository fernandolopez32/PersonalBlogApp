package com.example.personalblogapp.repositories;

import com.example.personalblogapp.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository <Post, Long> {
}
