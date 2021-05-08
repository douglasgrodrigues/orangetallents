package com.douglas.orangechallenge.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.douglas.orangechallenge.dto.UsuarioRequestDTO;
import com.douglas.orangechallenge.dto.UsuarioResponseDTO;
import com.douglas.orangechallenge.entity.Usuario;
import com.douglas.orangechallenge.exception.GenericError;
import com.douglas.orangechallenge.exception.UserNotFoundException;
import com.douglas.orangechallenge.mappers.UsuarioMapper;
import com.douglas.orangechallenge.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private EnderecoService enderecoService;

	public ResponseEntity<UsuarioResponseDTO> salvarUsuario(UsuarioRequestDTO usuario) {
		try {
			Usuario usuarioEntity = UsuarioMapper.mapToUserEntity(usuario);
			UsuarioResponseDTO usuarioResponseDTO = UsuarioMapper.mapToResponse(usuarioRepository.save(usuarioEntity));
			return ResponseEntity.status(HttpStatus.CREATED).body(usuarioResponseDTO);

		} catch (Exception error) {

			throw new GenericError(error.getMessage());
		}
	}

	public ResponseEntity<UsuarioResponseDTO> getUsuario(Long id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		if (usuario.isPresent()) {
			UsuarioResponseDTO usuarioResponseDTO = UsuarioMapper.mapToResponse(usuario.get());
			return ResponseEntity.ok().body(usuarioResponseDTO);
		} else
			throw new UserNotFoundException("Usuario não encontrado");
	}

}
