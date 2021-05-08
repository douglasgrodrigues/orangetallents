package com.douglas.orangechallenge.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	private String nome;
	private LocalDate nascimento;

	@Column(unique = true)
	private String email;

	@Column(unique = true)
	private String cpf;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<Endereco> listaEndereco = new ArrayList<>();
	
	  public Usuario() {
	  }
	public Usuario(String nome, LocalDate nascimento, String email, String cpf) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.email = email;
		this.cpf = cpf;
	}
	

	public void addEndereco(Endereco endereco) {
		this.listaEndereco.add(endereco);
	}

	public Long getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }


    public LocalDate getNascimento() {
        return nascimento;
    }


    public String getEmail() {
        return email;
    }


    public String getCpf() {
        return cpf;
    }


    public List<Endereco> getListaEndereco() {
        return listaEndereco;
    }
	
	

}
