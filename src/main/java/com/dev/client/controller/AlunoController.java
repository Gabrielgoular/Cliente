package com.dev.client.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.client.model.Aluno;
import com.dev.client.service.AlunoService;
 
@RestController
public class AlunoController {
	private final AlunoService alunoService;
	
	public AlunoController(AlunoService alunoService) {
		super();
		this.alunoService = alunoService;
	}
@GetMapping(path="/alunos")
	public ResponseEntity <List<Aluno>> listarTodos(){
	return new ResponseEntity(this.alunoService.listarTodos(), HttpStatus.OK);	
	}
@PostMapping(path ="/aluno" )
public ResponseEntity<Aluno> salvar(@RequestBody Aluno aluno){
	return new ResponseEntity<Aluno>(this.alunoService.cadastrar(aluno), HttpStatus.OK); 
	}
@DeleteMapping(path="/aluno/{id}")
public ResponseEntity<?>delete(@PathVariable Long id){
	this.alunoService.deletar(id);
	return new ResponseEntity<>(HttpStatus.OK);
	}
@GetMapping(path="/aluno/{id}")
public ResponseEntity<?>listarPorId(@PathVariable Long id){
	this.alunoService.listaPorId(id);
	return new ResponseEntity<>(HttpStatus.OK);
	}
@PutMapping(path="/aluno/{id}")
public ResponseEntity<?>save(@PathVariable Long id){
	this.alunoService.atualizar(null, id);
	return new ResponseEntity<>(HttpStatus.OK);
	}
}
