package com.example.Quizzer.service;

import com.example.Quizzer.entity.Question;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuestionService {
    ResponseEntity<Question> saveQuestion(Question question);

    ResponseEntity<List<Question>> getAllQuestions();
}
