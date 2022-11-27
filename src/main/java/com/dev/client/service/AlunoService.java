package com.dev.client.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dev.client.model.Aluno;
import com.dev.client.repository.AlunoRepository;


@Service
public class AlunoService {
	private final AlunoRepository alunoRepository; 

	public AlunoService(AlunoRepository alunoRepository) {
		super();
		this.alunoRepository = alunoRepository;
	}

	public Aluno cadastrar(Aluno aluno) {
		return	this.alunoRepository.save(aluno);
	}
	public Aluno atualizar(Aluno aluno, Long id) {
		Optional<Aluno> alunoASerAtualizado = this.alunoRepository.findById(id);
		if(alunoASerAtualizado.isPresent()) {
			aluno.setId(id);
			return this.alunoRepository.save(aluno);
		}return null;
	}
	public void deletar(Long id) {
		this.alunoRepository.deleteById(id);
	}
	public List<Aluno> listarTodos(){
		return this.alunoRepository.findAll();
	}
	public Aluno listaPorId(Long id) {
		Optional<Aluno>aluno=this.alunoRepository.findById(id);
		if (aluno.isPresent()) {
			return aluno.get();
		}
		return null;
	}
	
}