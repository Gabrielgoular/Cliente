package com.dev.client.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.client.model.Professor;
import com.dev.client.service.ProfessorService;

@RestController
public class ProfessorController {
	private final ProfessorService professorService;
	
	public ProfessorController(ProfessorService professorService) {
		super();
		this.professorService = professorService;
	}
@GetMapping(path="/Professor")
	public ResponseEntity<List<Professor>>listartodos(){
		return new ResponseEntity(this.professorService.listarTodos(), HttpStatus.OK);
	}

@DeleteMapping(path = "/professor/{id}")
public ResponseEntity<?> delete(@PathVariable Long id) {
	this.professorService.deletar(id);
	return new ResponseEntity<>(HttpStatus.OK);
	}
@GetMapping("/professor/{id}")
public ResponseEntity<?>listaPorId(@PathVariable Long id){
	this.professorService.listaPorId(id);
	return new ResponseEntity<>(HttpStatus.OK);
	}
@GetMapping(path="/professor")
public ResponseEntity<Professor>salvar(@RequestBody Professor professor){
	return new ResponseEntity<Professor>(this.professorService.cadastro(professor), HttpStatus.OK);
	}
@PutMapping(path="/professor")
public ResponseEntity<Professor>Atualizar(@RequestBody Professor professor){
	return new ResponseEntity<Professor>(this.professorService.cadastro(professor), HttpStatus.OK);
	}

}
