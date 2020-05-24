package com.NullMorososAPP.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NullMorososAPP.modelos.Morosos;


public interface MorososRepositorio extends JpaRepository<Morosos, Long> {

}
