package com.douglas.orangechallenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.douglas.orangechallenge.dto.EnderecoDTO;
import com.douglas.orangechallenge.entity.Endereco;
import com.douglas.orangechallenge.entity.Usuario;
import com.douglas.orangechallenge.exception.UserNotFoundException;
import com.douglas.orangechallenge.mappers.EnderecoMapper;
import com.douglas.orangechallenge.repository.EnderecoRepository;
import com.douglas.orangechallenge.repository.UsuarioRepository;

@Service
public class EnderecoService {
	
	@Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    public ResponseEntity<EnderecoDTO> salvarEndereco(Long usuarioId, EnderecoDTO endereco) {
        try {
            Usuario usuario = usuarioRepository.findById(usuarioId).get();
            Endereco enderecoEntity = EnderecoMapper.mapToAddressEntity(usuario, endereco);
            usuario = usuarioRepository.findById(usuarioId).get();
            usuario.addEndereco(enderecoEntity);
            usuarioRepository.save(usuario);
            return ResponseEntity.ok().body(EnderecoMapper.mapEntityToDto(enderecoEntity));
        } catch (Exception error) {
            throw new UserNotFoundException("Usuario não encontrado");
        }
    }

}
