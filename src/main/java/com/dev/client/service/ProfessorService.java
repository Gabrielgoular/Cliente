package com.dev.client.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.dev.client.model.Professor;
import com.dev.client.repository.ProfessorRepository;


@Service
public class ProfessorService {
	private final ProfessorRepository professorRepository;

	public ProfessorService(ProfessorRepository professorrepository) {
		super();
		this.professorRepository= professorrepository;
	}
	public Professor atualizar(Professor professor, Long id) {
		Optional<Professor> professorASerAtualizado = this.professorRepository.findById(id);
		if(professorASerAtualizado.isPresent()) {
			professor.setProfeId(id);
			return this.professorRepository.save(professor);
		}
		return null;
 }
	public void deletar(Long id) {
		this.professorRepository.deleteById(id);
	}
	public List<Professor> listarTodos(){
		return this.professorRepository.findAll();
	}
	public Professor listaPorId(Long id) {
		Optional<Professor>professor=this.professorRepository.findById(id);
		if(professor.isPresent()) {
			return professor.get();
		}
		return null;
 }
	public Professor cadastro (Professor professor) {
		return this.professorRepository.save(professor);
	}
}
