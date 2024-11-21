package com.example.Spring_boot_app.controller;

import com.example.Spring_boot_app.dto.QuestionDto;
import com.example.Spring_boot_app.dto.RestServiceResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/question")
public class QuestionController extends BaseController  {

    @GetMapping("{id}")
    public ResponseEntity<RestServiceResponse> getQuestionID(@PathVariable String id){
        return ResponseEntity.ok().body(getSuccessResponse("Fetched Successfully"));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<RestServiceResponse> deleteQuestion(@PathVariable String id){
        return ResponseEntity.ok().body(getSuccessResponse("Deleted Successfully"));
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<RestServiceResponse> saveQuestion(@PathVariable QuestionDto questionDto){
        return ResponseEntity.ok().body(getSuccessResponse("Saved Successfully"));
    }

    @PostMapping(value = "/serach", consumes = "application/json")
    public ResponseEntity<RestServiceResponse> searchQuestion(){
        return ResponseEntity.ok().body(getSuccessResponse("Search Successfully"));
    }
}
