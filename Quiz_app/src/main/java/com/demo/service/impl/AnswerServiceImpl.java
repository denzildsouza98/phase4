package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.AnswerDAO;
import com.demo.dao.QuizDAO;
import com.demo.model.Answer;
import com.demo.model.Quiz;
import com.demo.service.AnswerService;


@Service
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	private AnswerDAO dao;
	@Autowired
	private QuizDAO qdao;
	
	@Override
	public Answer createAnswer(Answer answer) throws Exception {
		List<Quiz> quiz=qdao.findAll();
		int q_max=quiz.size();
		if(answer.getId()>q_max || answer.getId()<0) {
			throw new Exception();
		}
		if(answer.getAnswer()>4 || answer.getAnswer()<0) {
			throw new Exception();
		}
		
		return dao.save(answer);
	}

	@Override
	public List<Answer> getAllAnswers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
