package com.demo.service;

import java.util.List;

import com.demo.model.Answer;

public interface AnswerService {
	public Answer createAnswer(Answer answer) throws Exception;
	public List<Answer> getAllAnswers();

}
