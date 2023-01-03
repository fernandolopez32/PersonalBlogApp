package com.example.personalblogapp.controllers;

import com.example.personalblogapp.models.Post;
import com.example.personalblogapp.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute(new Post());
        return "home";
    }

    @PostMapping("/createPost")
    public String createPost(@ModelAttribute Post post){
        postDao.save(post);
        return "redirect:/";
    }
    @GetMapping("/randomize")
    public String randomizer(){
        return "/randomize";
    }
}
