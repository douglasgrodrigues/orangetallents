package com.douglas.orangechallenge.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.br.CPF;

import com.douglas.orangechallenge.utils.DataUtils;
import com.fasterxml.jackson.annotation.JsonFormat;

public class UsuarioRequestDTO {
	
	private String nome;
    @JsonFormat(pattern = DataUtils.DATE_TIME_FORMAT_BR)
    private LocalDate nascimento;
    @Email(message = "Informe um email válido")
    private String email;
    @CPF(message = "Informe um CPF válido")
    private String cpf;
    
    public UsuarioRequestDTO(){}
    public UsuarioRequestDTO(String nome, LocalDate nascimento, String email, String cpf) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
        this.cpf = cpf;
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

	
}
