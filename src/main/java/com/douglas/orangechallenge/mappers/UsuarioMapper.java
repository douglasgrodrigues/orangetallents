package com.douglas.orangechallenge.mappers;

import java.util.stream.Collectors;

import com.douglas.orangechallenge.dto.UsuarioRequestDTO;
import com.douglas.orangechallenge.dto.UsuarioResponseDTO;
import com.douglas.orangechallenge.entity.Usuario;

public class UsuarioMapper {

	public static Usuario mapToUserEntity(UsuarioRequestDTO usuarioRequestDTO) {

		return new Usuario(usuarioRequestDTO.getNome(), usuarioRequestDTO.getNascimento(), usuarioRequestDTO.getEmail(),
				usuarioRequestDTO.getCpf());
	}

	public static UsuarioResponseDTO mapToResponse(Usuario usuario) {
		return new UsuarioResponseDTO(usuario.getNome(), usuario.getNascimento(), usuario.getEmail(),
				usuario.getListaEndereco().stream().map(EnderecoMapper::mapEntityToDto).collect(Collectors.toList()));
	}

}
