package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Answer;

@Repository
public interface AnswerDAO extends JpaRepository<Answer, Integer>{

}
