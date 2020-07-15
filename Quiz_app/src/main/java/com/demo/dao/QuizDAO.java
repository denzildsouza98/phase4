package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Quiz;

@Repository
public interface QuizDAO extends JpaRepository<Quiz, Integer>{

}
