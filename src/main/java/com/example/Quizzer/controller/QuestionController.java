package com.example.Quizzer.controller;

import com.example.Quizzer.entity.Question;
import com.example.Quizzer.service.QuestionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping("/save")
    public Question saveQuestion(@Valid @RequestBody Question question){
        return questionService.saveQuestion(question);
    }

    @GetMapping("/allquestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }
}
