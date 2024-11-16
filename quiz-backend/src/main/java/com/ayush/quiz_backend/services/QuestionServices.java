package com.ayush.quiz_backend.service;

import com.ayush.quiz_backend.entity.Question;
import com.ayush.quiz_backend.repo.QuestionRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QuestionServices {

    private final QuestionRepo questionRepo;

    @Autowired
    public QuestionServices(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    @PostConstruct
    public void init() {
        if(questionRepo.count()==0){
            List<Question> questions = Arrays.asList(
                    new Question(null, "What is the size of `int` in Java?", "4 bytes", Arrays.asList("2 bytes", "4 bytes", "8 bytes", "16 bytes")),
                    new Question(null, "Which of the following is a valid access modifier in Java?", "private", Arrays.asList("private", "invisible", "secure", "definite")),
                    new Question(null, "What is the default value of a boolean variable in Java?", "false", Arrays.asList("true", "false", "null", "0")),
                    new Question(null, "Which method is used to start a thread in Java?", "start()", Arrays.asList("run()", "execute()", "start()", "initialize()")),
                    new Question(null, "Which of these is not a primitive data type in Java?", "String", Arrays.asList("int", "boolean", "char", "String")),
                    new Question(null, "What is the wrapper class for `int` in Java?", "Integer", Arrays.asList("Int", "Integer", "IntWrapper", "IntegerWrapper")),
                    new Question(null, "Which of the following is used to handle exceptions in Java?", "try-catch", Arrays.asList("if-else", "try-catch", "throw-throws", "assert")),
                    new Question(null, "Which collection class does not allow duplicate elements?", "Set", Arrays.asList("List", "Set", "Queue", "Map")),
                    new Question(null, "What does JVM stand for?", "Java Virtual Machine", Arrays.asList("Java Variable Machine", "Java Virtual Memory", "Java Virtual Machine", "Java Version Machine")),
                    new Question(null, "Which of the following is a superclass of all classes in Java?", "Object", Arrays.asList("String", "Object", "Class", "Serializable"))
            );

            questionRepo.saveAll(questions);
        }
    }

    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }
}
