package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Answer {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public int answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	public Answer() {
		super();
	}
	public Answer(int answer) {
		super();
		this.answer = answer;
	}

}
