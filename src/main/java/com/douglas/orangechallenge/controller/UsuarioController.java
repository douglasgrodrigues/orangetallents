package com.douglas.orangechallenge.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.douglas.orangechallenge.dto.UsuarioRequestDTO;
import com.douglas.orangechallenge.dto.UsuarioResponseDTO;
import com.douglas.orangechallenge.service.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "/usuario/cadastrar")
    public ResponseEntity<UsuarioResponseDTO> salvarUsuario(@Valid @RequestBody UsuarioRequestDTO usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    @GetMapping(value = "/usuario/buscar/{id}")
    public ResponseEntity<UsuarioResponseDTO> getUsuario(@PathVariable Long id) {
        return usuarioService.getUsuario(id);
    
    }

}
