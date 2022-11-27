package com.dev.client.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;


@Entity
@Table(name = "alunos")
public class Aluno  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  alunoId;
	@NotNull
	private String name;
	@NotNull
	private String sobreNome;
	@CPF
	private Long cpf;
	@NotNull
	private Date data;
	
	private String nomePai;
	
	private String nomeMae;
	
	

	public Aluno() {
			super();
		}

	public Aluno(Long alunoId) {
		super();
		this.alunoId = alunoId;
	}

	public Aluno(Long id, String name, String sobreNome, Long cpf, Date data, String nomePai, String nomeMae) {
		super();
		this.alunoId = id;
		this.name = name;
		this.sobreNome = sobreNome;
		this.cpf = cpf;
		this.data = data;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
	}

	public Long getId() {
		return alunoId;
	}

	public void setId(Long id) {
		this.alunoId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

}
