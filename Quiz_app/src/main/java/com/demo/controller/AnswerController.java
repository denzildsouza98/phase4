package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Answer;
import com.demo.service.AnswerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AnswerController {

	@Autowired
	private AnswerService service;
	
	@PutMapping("/answer")
	public Answer createAnswer(@RequestBody Answer answer) {
		// TODO Auto-generated method stub
		try {
			return service.createAnswer(answer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@GetMapping("/answer")
	public List<Answer> getAllAnswers() {
		// TODO Auto-generated method stub
		return service.getAllAnswers();
	}
	
	

	
}
