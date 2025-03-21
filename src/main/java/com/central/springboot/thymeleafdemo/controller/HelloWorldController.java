package com.central.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/showForm")
public class HelloWorldController {

    // Show HTML form

    @GetMapping
    public String showForm() {
        return "helloworld-form";
    }

    // Process HTML Form
    @PostMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }
}
