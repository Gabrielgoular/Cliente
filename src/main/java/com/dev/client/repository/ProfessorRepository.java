package com.dev.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.dev.client.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{
	

}