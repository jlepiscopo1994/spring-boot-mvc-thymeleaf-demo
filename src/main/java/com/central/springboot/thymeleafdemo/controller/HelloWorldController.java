package com.central.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    // Add controller method to read form data and add data to model

    @PostMapping("/processFormV2")
    public String allCaps(HttpServletRequest request, Model model) {

        // Read request parameter from form
        String name = request.getParameter("studentName");

        // convert message to all caps and concap message
        name = name.toUpperCase();

        String result = "STOP SHOUTING " + name + "!";

        // add message to model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
