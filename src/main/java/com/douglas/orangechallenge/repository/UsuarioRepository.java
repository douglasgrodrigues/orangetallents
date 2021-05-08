package com.douglas.orangechallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglas.orangechallenge.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
