package com.douglas.orangechallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.douglas.orangechallenge.dto.EnderecoDTO;
import com.douglas.orangechallenge.service.EnderecoService;


@RestController
public class EnderecoController {
	
	@Autowired
    private EnderecoService enderecoService;


    @PostMapping(value = "/endereco/cadastro/{usuarioId}")
    public ResponseEntity<EnderecoDTO> salvarEndereco(@PathVariable Long usuarioId, @RequestBody EnderecoDTO endereco) {
        return enderecoService.salvarEndereco(usuarioId, endereco);
    }

}
