package com.douglas.orangechallenge.mappers;

import com.douglas.orangechallenge.dto.EnderecoDTO;
import com.douglas.orangechallenge.entity.Endereco;
import com.douglas.orangechallenge.entity.Usuario;

public class EnderecoMapper {

    public static Endereco mapToAddressEntity(Usuario usuario, EnderecoDTO enderecoDTO) {
        return new Endereco(
                usuario,
                enderecoDTO.getLogradouro(),
                enderecoDTO.getNumero(),
                enderecoDTO.getComplemento(),
                enderecoDTO.getBairro(),
                enderecoDTO.getCidade(),
                enderecoDTO.getEstado(),
                enderecoDTO.getCep()
        );
    }

    public static EnderecoDTO mapEntityToDto(Endereco endereco) {
        return new EnderecoDTO(
                endereco.getUsuario().getId(),
                endereco.getId(),
                endereco.getLogradouro(),
                endereco.getNumero(),
                endereco.getComplemento(),
                endereco.getBairro(),
                endereco.getCidade(),
                endereco.getEstado(),
                endereco.getCep()
        );
    }

}
