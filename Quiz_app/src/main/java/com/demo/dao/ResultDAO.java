package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Result;

@Repository
public interface ResultDAO extends JpaRepository<Result, Integer>{

}
