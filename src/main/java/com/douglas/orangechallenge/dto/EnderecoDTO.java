package com.douglas.orangechallenge.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class EnderecoDTO {

	private Long usuarioId;

	@GeneratedValue
	@Id
	private Long id;
	private String endereco;

	private String logradouro;
	private Integer numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private Integer cep;

	public EnderecoDTO() {
	}

	public EnderecoDTO(Long usuarioId, Long id, String logradouro, Integer numero, String complemento, String bairro,
			String cidade, String estado, Integer cep) {
		this.usuarioId = usuarioId;
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
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

	public Long getUsuarioId() {
		return usuarioId;
	}

}
