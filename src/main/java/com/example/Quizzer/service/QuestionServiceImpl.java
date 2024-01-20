package com.example.Quizzer.service;

import com.example.Quizzer.entity.Question;
import com.example.Quizzer.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    private QuestionRepository repository;

    @Override
    public Question saveQuestion(Question question){
        return repository.save(question);
    }

    @Override
    public List<Question> getAllQuestions(){
        return repository.findAll();
    }
}
