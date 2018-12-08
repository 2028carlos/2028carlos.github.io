package edu.pe.cibertec.spring.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.pe.cibertec.spring.model.Usuario;

import edu.pe.cibertec.spring.service.UsuarioService;



@Controller
public class UsuarioController {
	
	UsuarioService usuarioService;

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}
	@Autowired(required = true)
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	
	@RequestMapping(value = "/logeo", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getAllPersons(Model model) {

		
		model.addAttribute("usuario", new Usuario());
		
		return "Login";
	}

	
	
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView viewLogin(@ModelAttribute Usuario usuario) {
		return new ModelAndView("login");
	}

	
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute Usuario usuario) {
		Usuario emp = usuarioService.getEmployee(usuario);
		ModelAndView model = null;
		if (emp == null) {
			model = new ModelAndView("Login");
			model.addObject("msj", "Usuario/Contraseña Incorrectas");
		} else {
			model = new ModelAndView("Citas");
			model.addObject("getName", emp.getNombre());
		}
		return model;
	}

}
