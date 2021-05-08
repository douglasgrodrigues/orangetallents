package com.douglas.orangechallenge.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	private String logradouro;
	private Integer numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private Integer cep;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	public Endereco() {
	}

	public Endereco(Usuario usuario, String logradouro, Integer numero, String complemento, String bairro, String cidade,
			String estado, Integer cep) {
		this.usuario = usuario;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public Long getId() {
		return id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public Integer getCep() {
		return cep;
	}

	public Usuario getUsuario() {
		return usuario;
	}

}
