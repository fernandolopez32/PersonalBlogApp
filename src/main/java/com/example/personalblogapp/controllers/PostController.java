package com.example.personalblogapp.controllers;

import com.example.personalblogapp.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute(new Post());
        return "home";
    }

    @PostMapping("createPost")
    public String createPost(){
        return "redirect:/";
    }
}
