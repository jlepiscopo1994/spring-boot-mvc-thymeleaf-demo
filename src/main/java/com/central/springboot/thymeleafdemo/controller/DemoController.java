package com.central.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class DemoController {

    @GetMapping("/helloworld")
    public String sayHello(Model model) {

        model.addAttribute("date", java.time.LocalDate.now());

        return "helloworld";
    }
}
