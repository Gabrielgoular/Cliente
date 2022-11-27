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

import com.dev.client.model.Ocorrencia;
import com.dev.client.service.OcorrenciaService;

@RestController
public class OcorrenciaController {
	private final OcorrenciaService ocorrenciaService;

	public OcorrenciaController(OcorrenciaService ocorrenciaService) {
		super();
		this.ocorrenciaService = ocorrenciaService;
	}
	
@GetMapping(path="/ocorrencia")
public ResponseEntity<Ocorrencia> salvar(@RequestBody Ocorrencia ocorrencia){
	return new ResponseEntity<Ocorrencia>(this.ocorrenciaService.cadastrar(ocorrencia), HttpStatus.OK);
}
@GetMapping(path="/Ocorrencia")
  public ResponseEntity<List<Ocorrencia>>listarTodos(){
	return new ResponseEntity(this.ocorrenciaService.listarTodos(), HttpStatus.OK);
}
@DeleteMapping(path="/ocorrencia/{id}")
public ResponseEntity<?>delete(@PathVariable Long id ){
	this.ocorrenciaService.deletar(id);
	return new ResponseEntity<>(HttpStatus.OK);
	}	
@GetMapping(path="/ocorrenci/{id}")
public ResponseEntity<?>listaPorId(@PathVariable Long id){
	this.ocorrenciaService.listaPorId(id);
	return new ResponseEntity<>(HttpStatus.OK); 
	}
@PutMapping(path="/ocorrencia/{id}")
public ResponseEntity<?>save(@PathVariable Long id){
	this.ocorrenciaService.atualizar(null, id);
	return new  ResponseEntity<>(HttpStatus.OK);
	
}
}
