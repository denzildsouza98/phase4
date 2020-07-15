package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Quiz;
import com.demo.service.QuizService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class QuizController {

	@Autowired
	private QuizService service;

	@GetMapping("/quiz")
	public List<Quiz> getAllQuiz() {
		// TODO Auto-generated method stub
		return service.getAllQuiz();
	}
}
