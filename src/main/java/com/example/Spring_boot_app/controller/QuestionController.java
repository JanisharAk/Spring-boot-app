package com.example.Spring_boot_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class QuestionController {
    @GetMapping("api/v1/greeting")
    public String greeting() {
        return "Hello World";
    }
    @GetMapping("api/v1")
    public String getQuestion(){
        return null;
    }

    @PostMapping("api/v2")
    public String saveQuestion(){
        return null;
    }

    @DeleteMapping("api/v3")
    public String deleteQuestion(){
        return null;
    }

    @GetMapping("api/v4")
    public String searchQuestion(){
        return null;
    }


}
