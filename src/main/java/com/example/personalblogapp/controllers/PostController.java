package com.example.personalblogapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
