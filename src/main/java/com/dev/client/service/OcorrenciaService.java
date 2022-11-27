package com.dev.client.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.dev.client.model.Ocorrencia;
import com.dev.client.repository.OcorrenciaRepository;

@Service
public class OcorrenciaService {
	private final OcorrenciaRepository ocorrenciaRepository;

	public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository) {
		super();
		this.ocorrenciaRepository = ocorrenciaRepository;
	}
	public Ocorrencia cadastrar(Ocorrencia ocorrencia) {
		return this.ocorrenciaRepository.save(ocorrencia);
	}
	public Ocorrencia atualizar(Ocorrencia ocorrencia, Long id) {
		Optional<Ocorrencia> ocorrenciaASerAtualizado = this.ocorrenciaRepository.findById(id);
		if(ocorrenciaASerAtualizado.isPresent()) {
			ocorrencia.setOcorrenciaId(id);
			return this.ocorrenciaRepository.save(ocorrencia);
		}return null;
	}
	public void deletar(Long id) {
			this.ocorrenciaRepository.deleteById(id);
		}
	public List<Ocorrencia>listarTodos(){
		return this.ocorrenciaRepository.findAll();
	}
	public Ocorrencia listaPorId(Long id) {
		Optional<Ocorrencia>ocorrencia=this.ocorrenciaRepository.findById(id);
		if (ocorrencia.isPresent()) {
			return ocorrencia.get();
		}
		return null;
	}
}
