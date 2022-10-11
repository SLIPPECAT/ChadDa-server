package com.search.instagramsearching.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/locationPost")
    public String helloForm(){
        return "locationPost.html";
    }
    @GetMapping("/user-posts")
    public String userForm() {
        return "user-posts.html";
    }
}
