package com.dev.client.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long profeId;
	@NotNull
	private String nome;
	@NotNull
	private String formacao;
	public Professor(@NotNull Long profeId, @NotNull String nome, @NotNull String formacao) {
		super();
		this.profeId = profeId;
		this.nome = nome;
		this.formacao = formacao;
	}
	public Long getProfeId() {
		return profeId;
	}
	public void setProfeId(Long profeId) {
		this.profeId = profeId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
}
