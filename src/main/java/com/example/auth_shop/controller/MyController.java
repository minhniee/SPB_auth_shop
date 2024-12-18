package com.example.auth_shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @CrossOrigin(origins = "http://localhost:8082")
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to My Spring Boot Application!");
        return "index"; // Returns the view name (index.html)
    }
}