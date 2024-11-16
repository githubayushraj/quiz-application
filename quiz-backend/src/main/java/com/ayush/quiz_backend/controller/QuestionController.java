package com.ayush.quiz_backend.controller;

import com.ayush.quiz_backend.entity.Question;
import com.ayush.quiz_backend.service.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class QuestionController {
    private final QuestionServices services;

    @Autowired
    public QuestionController(QuestionServices services){
        this.services = services;
    }

    @GetMapping("/questions")
    public List<Question> getQuestions(){
        return services.getAllQuestions();
    }
}
