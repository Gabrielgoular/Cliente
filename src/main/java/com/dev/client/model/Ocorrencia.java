package com.dev.client.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Ocorrencia")
public class Ocorrencia {
	private static final boolean treu = false;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ocorrenciaId;
	@NotNull
 	private String descOcorrencia;
	@NotNull
 	private Date dataOcorrencia;
	@JoinColumn(name="alunoId")
	@ManyToOne(fetch=FetchType.LAZY)
	private Aluno aluno;
	@JoinColumn(name="profeId")
	@ManyToOne(fetch=FetchType.LAZY)
	private Professor professor;
	public Ocorrencia(Long ocorrenciaId, @NotNull String descOcorrencia, @NotNull Date dataOcorrencia, Aluno aluno,
			Professor professor) {
		super();
		this.ocorrenciaId = ocorrenciaId;
		this.descOcorrencia = descOcorrencia;
		this.dataOcorrencia = dataOcorrencia;
		this.aluno = aluno;
		this.professor = professor;
	}
	public Long getOcorrenciaId() {
		return ocorrenciaId;
	}
	public void setOcorrenciaId(Long ocorrenciaId) {
		this.ocorrenciaId = ocorrenciaId;
	}
	public String getDescOcorrencia() {
		return descOcorrencia;
	}
	public void setDescOcorrencia(String descOcorrencia) {
		this.descOcorrencia = descOcorrencia;
	}
	public Date getDataOcorrencia() {
		return dataOcorrencia;
	}
	public void setDataOcorrencia(Date dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public static boolean isTreu() {
		return treu;
	}
	
	}
