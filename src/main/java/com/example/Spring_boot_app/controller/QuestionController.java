package com.example.Spring_boot_app.controller;

import com.example.Spring_boot_app.dto.QuestionDto;
import com.example.Spring_boot_app.dto.RestServiceResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class QuestionController {

    @GetMapping("api/v1")
    public ResponseEntity<RestServiceResponse> getQuestionID(@PathVariable String id){
        return null;
    }

    @DeleteMapping("api/v3")
    public ResponseEntity<RestServiceResponse> deleteQuestion(@PathVariable String id){
        return null;
    }

    @PostMapping("api/v2")
    public ResponseEntity<RestServiceResponse> saveQuestion(@PathVariable QuestionDto questionDto){
        return null;
    }

    @GetMapping("api/v4")
    public ResponseEntity<RestServiceResponse> searchQuestion(){
        return null;
    }
}
