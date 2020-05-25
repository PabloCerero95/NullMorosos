package com.NullMorososAPP.controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.NullMorososAPP.modelos.Morosos;
import com.NullMorososAPP.modelos.Usuarios;
import com.NullMorososAPP.repositorios.MorososRepositorio;
import com.NullMorososAPP.repositorios.UsuariosRepositorio;

@Controller
@Scope("session")
public class AppController {

	@Autowired
	private UsuariosRepositorio usuariosRepositorio;

	@Autowired
	private MorososRepositorio morososRepositorio;

//	@RequestMapping("/login")
//	public String login() {
//		return "login";
//	}

	@GetMapping("/login")
	public String irLoginUsuario() {
		// model.addAttribute("usuario", new Usuarios());
		System.out.println("Ir a login");
		return "login";
	}

	@PostMapping(value = "/login")
	public String loginUsuario(HttpServletRequest request, @RequestParam String nick, @RequestParam String clave,
			RedirectAttributes redirectAttrs) {

		List<Usuarios> usuarios = usuariosRepositorio.findByNickAndClave(nick, clave);
		if (usuarios.isEmpty()) {
//        	redirectAttrs
//            .addFlashAttribute("mensaje", "Datos correctos")
//            .addFlashAttribute("clase", "success");

			return "redirect:/login";

		} else {
			request.getSession().setAttribute("usuarioID", usuarios.get(0).getId());
//        	redirectAttrs
//            .addFlashAttribute("mensaje", "Datos correctos")
//            .addFlashAttribute("clase", "success");
			return "redirect:/menu";
		}

	}

	@GetMapping("/FormUsuario")
	public String formUsuario() {
		return "FormUsuario";
	}

	@PostMapping(value = "/guardarUsuario")
	public String guardarUsuario(@RequestParam String nombre, @RequestParam String apellidos, @RequestParam String nick,
			@RequestParam String clave, RedirectAttributes redirectAttrs) {
		Usuarios usuario = new Usuarios(nombre, apellidos, nick, clave);
		usuariosRepositorio.save(usuario);
		redirectAttrs.addFlashAttribute("mensaje", "Agregado correctamente").addFlashAttribute("clase", "success");
		return "redirect:/login";
	}

	@RequestMapping("/FormAddMoroso")
	public String formAddMoroso() {
		return "FormAddMoroso";
	}
	
	@PostMapping(value = "/irEditarMoroso")
	public String formEditMoroso(Model model, @RequestParam long id) {
		model.addAttribute("moroso", morososRepositorio.getOne(id));
		return "FormEditMoroso";
	}

	@PostMapping(value = "/guardarMoroso")
	public String guardarMoroso(HttpServletRequest request, @RequestParam String nombre, @RequestParam String apellidos,
			@RequestParam String cantidad, RedirectAttributes redirectAttrs) {
		long usuarioID = (long) request.getSession().getAttribute("usuarioID");
		Usuarios usuarioSesion = usuariosRepositorio.getOne(usuarioID);
		Morosos moroso = new Morosos(nombre, apellidos, usuarioSesion, Float.parseFloat(cantidad));
		morososRepositorio.save(moroso);
		redirectAttrs.addFlashAttribute("mensaje", "Agregado correctamente").addFlashAttribute("clase", "success");
		return "redirect:/menu";
	}

	@PostMapping(value = "/eliminarMoroso")
	public String eliminarMoroso(Model model, @RequestParam long id) {
		morososRepositorio.deleteById(id);
		return "redirect:/menu";
	}
		
//	@PostMapping(value = "/eliminarMorosos")
//	public String eliminarMorosos(HttpServletRequest request, Model model) {
//		long usuarioID = (long) request.getSession().getAttribute("usuarioID");
//		Usuarios usuarioSesion = usuariosRepositorio.getOne(usuarioID);
//		model.addAttribute(morososRepositorio.findAllByusuario(usuarioSesion));
//		morososRepositorio.deleteAll();
//		return "redirect:/menu";
//	}
	
	@PostMapping(value = "/editarMoroso")
	public String editarMoroso(@RequestParam long id, @RequestParam String nombre, @RequestParam String apellidos,
			@RequestParam String cantidad, RedirectAttributes redirectAttrs) {
		Morosos moroso = morososRepositorio.getOne(id);
		moroso.setNombre(nombre);
		moroso.setApellidos(apellidos);
		moroso.setCantidad(Float.parseFloat(cantidad));
		morososRepositorio.save(moroso);
		return "redirect:/menu";
	}

	@GetMapping("/menu")
	public String menu(HttpServletRequest request, Model model) {
		long usuarioID = (long) request.getSession().getAttribute("usuarioID");
		Usuarios usuarioSesion = usuariosRepositorio.getOne(usuarioID);
		model.addAttribute("morosos", morososRepositorio.findAllByusuario(usuarioSesion));
		return "menu";
	}
}
