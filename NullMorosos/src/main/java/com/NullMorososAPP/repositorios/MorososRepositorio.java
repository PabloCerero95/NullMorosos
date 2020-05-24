package com.NullMorososAPP.repositorios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.NullMorososAPP.modelos.Morosos;
import com.NullMorososAPP.modelos.Usuarios;


public interface MorososRepositorio extends JpaRepository<Morosos, Long> {

	Morosos findFirstBynombre(String nombre);
	
//	@Modifying
//	@Query(value = "delete from Morosos m WHERE m.usuario_id=:usuario_id")
	void deleteByusuario(Usuarios usuario);
	
	@Query(value = "SELECT m FROM Morosos m WHERE m.usuario = ?1")
	List<Morosos> findAllByusuario(Usuarios usuario);
	
		
	
}
