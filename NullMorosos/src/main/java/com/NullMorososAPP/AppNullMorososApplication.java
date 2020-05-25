package com.NullMorososAPP;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.NullMorososAPP.modelos.Morosos;
import com.NullMorososAPP.modelos.Usuarios;
import com.NullMorososAPP.repositorios.MorososRepositorio;
import com.NullMorososAPP.repositorios.UsuariosRepositorio;

@SpringBootApplication
@ComponentScan
public class AppNullMorososApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppNullMorososApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner initData(UsuariosRepositorio usuarioRepositorio, MorososRepositorio morosoRepositorio) {
//		return args -> {
//
//			Usuarios usuario = new Usuarios("pablo", "barbaro", "pablo", "1243");
//			Usuarios usuario = new Usuarios("Juan", "Perez", "juanPerro", "Eleee");
//			Usuarios usuario = new Usuarios("alesito", "diaz", "alexporrero", "pelo");
//			usuario = usuarioRepositorio.save(usuario);
//
//			Morosos moroso = new Morosos("pollo", "pollete", usuario, 20.50f);
//			Morosos moroso = new Morosos("sergio", "gorditofeliz", usuario, 567.50);
//			morosoRepositorio.save(moroso);
//
//		};
//	}
}
