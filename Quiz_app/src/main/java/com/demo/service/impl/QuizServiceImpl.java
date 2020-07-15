package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.QuizDAO;
import com.demo.model.Quiz;
import com.demo.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{

	@Autowired
	private QuizDAO dao;
	
	@Override
	public List<Quiz> getAllQuiz() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
