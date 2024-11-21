package com.example.Spring_boot_app.service;

import com.example.Spring_boot_app.dto.QuestionDto;

import java.util.List;

public interface QuestionService {
    public QuestionDto  getQuestionByID(final String id);
    public boolean deleteQuestion(final String id);
    public QuestionDto saveQuestion(final QuestionDto question);
    public List<QuestionDto> searchQuestions();
}
