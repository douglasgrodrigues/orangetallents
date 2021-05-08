package com.douglas.orangechallenge.dto;

import java.time.LocalDate;
import java.util.List;

public class UsuarioResponseDTO {
    private String nome;
    private LocalDate nascimento;
    private String email;
    private List<EnderecoDTO>listaEndereco;


    public UsuarioResponseDTO(String nome, LocalDate nascimento, String email, List<EnderecoDTO> listaEndereco) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
        this.listaEndereco = listaEndereco;
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

    public List<EnderecoDTO> getListaEndereco() {
        return listaEndereco;
    }

}


