package com.NullMorososAPP.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NullMorososAPP.modelos.Usuarios;


@Repository
public interface UsuariosRepositorio extends JpaRepository<Usuarios, Long> {

}

