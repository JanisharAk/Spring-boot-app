package com.example.Spring_boot_app.service;

import com.example.Spring_boot_app.dto.QuestionDto;

import java.util.List;

public class QuestionServiceImpl implements QuestionService {

    @Override
    public QuestionDto getQuestionByID(String id) {
        return null;
    }

    @Override
    public boolean deleteQuestion(String id) {
        return false;
    }

    @Override
    public QuestionDto saveQuestion(QuestionDto question) {
        return null;
    }

    @Override
    public List<QuestionDto> searchQuestions() {
        return List.of();
    }
}
