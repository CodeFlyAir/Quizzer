package com.example.Quizzer.service;

import com.example.Quizzer.entity.Question;
import com.example.Quizzer.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    private QuestionRepository repository;

    @Override
    public ResponseEntity<Question> saveQuestion(Question question){
        return new ResponseEntity<>(repository.save(question),HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<Question>> getAllQuestions(){
        try{
            return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }
}
