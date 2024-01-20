package com.example.Quizzer.service;

import com.example.Quizzer.entity.Question;

import java.util.List;

public interface QuestionService {
    Question saveQuestion(Question question);

    List<Question> getAllQuestions();
}
