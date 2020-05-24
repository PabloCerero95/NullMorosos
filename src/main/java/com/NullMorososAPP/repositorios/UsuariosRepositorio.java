package com.NullMorososAPP.repositorios;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.NullMorososAPP.modelos.Usuarios;


@Repository
public interface UsuariosRepositorio extends JpaRepository<Usuarios, Long> {
	
	@Query(value = "SELECT u FROM Usuarios u WHERE u.nick = ?1 and u.clave = ?2")
	List<Usuarios> loginUsuario(String nick, String clave);
	
	List<Usuarios> findByNickAndClave(String nick, String clave);
}

