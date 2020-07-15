package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.AnswerDAO;
import com.demo.dao.QuizDAO;
import com.demo.dao.ResultDAO;
import com.demo.model.Answer;
import com.demo.model.Quiz;
import com.demo.model.Result;
import com.demo.service.AnswerService;
import com.demo.service.QuizService;
import com.demo.service.ResultService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ResultController {
	public static int attempt;
	
	@Autowired
	private QuizService qservice;
	
	@Autowired
	private AnswerService aservice;
	
	@Autowired
	private QuizDAO qdao;
	
	@Autowired
	private AnswerDAO adao;

	@Autowired
	private ResultService service;
	
	@Autowired
	private ResultDAO dao;
	
	@GetMapping("/result")
	public List<Result> getAllResult() {
		int score =0;
		List<Quiz> quiz=qservice.getAllQuiz();
		List<Answer> answer=aservice.getAllAnswers();
		for (int i = 1; i <= quiz.size(); i++) {
			try {
				Quiz q=qdao.getOne(i);
				Answer a=adao.getOne(i);
				if(q.getCorrect_answer()==a.answer) {
					score=score+5;
				}
				else if (a.answer==0) {
					score=score+0;
				}
				else {
					score=score-1;
				}
			}
			catch(Exception e) {
				System.out.println("Not found");
			}
		}
		Result r=new Result();
		r.setId(++attempt);
		r.setScore(score);
		int max_score=quiz.size()*5;
		float res=(float)score/max_score;
		System.out.println(res);
		if(res>=0.8) {
			r.setGrade("A");
			r.setRemark("Awersome");
			
		}
		else {
			if(res>0.6) 
			{
			r.setGrade("B");
			r.setRemark("Good");
			}
			else
			{
				if(res>0.4) 
				{
					r.setGrade("C");
					r.setRemark("Poor");
				}
				else 
				{
					if(res<0.4) {
						r.setGrade("F");
						r.setRemark("Fail");
					}
				}
			
		}
		}
		dao.save(r);
		return service.getAllResult();
	}
	
//	@GetMapping("/result")
//	public int getResult() {
//		int score =0;
//		List<Quiz> quiz=qservice.getAllQuiz();
//		List<Answer> answer=aservice.getAllAnswers();
//		for (int i = 1; i <= quiz.size(); i++) {
//			try {
//				Quiz q=qdao.getOne(i);
//				Answer a=adao.getOne(i);
//				if(q.getCorrect_answer()==a.answer) {
//					score=score+4;
//				}
//				else if (a.answer==0) {
//					score=score+0;
//				}
//				else {
//					score=score-1;
//				}
//			}
//			catch(Exception e) {
//				System.out.println("Not found");
//			}
//		}
//		return score;
//		
//	}
//	if(score/max_score>=0.8) {
//		r.setGrade("A");
//		r.setRemark("Awersome");
//	}
//	if (score/max_score>=0.6 && score/max_score<0.8) {
//		r.setGrade("B");
//		r.setRemark("Good");
//	}
//	if(score/max_score>=0.4 && score/max_score<0.6) {
//		r.setGrade("C");
//		r.setRemark("Average");
//	}
//	if(score/max_score>=0.2 && score/max_score<0.4) {
//		r.setGrade("D");
//		r.setRemark("Poor");
//	}
//	if(score/max_score<0.2){
//		r.setGrade("F");
//		r.setRemark("Fail");
//	}
//	
}
