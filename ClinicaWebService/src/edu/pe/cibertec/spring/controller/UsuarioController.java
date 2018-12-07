//package edu.pe.cibertec.spring.controller;
//
//import java.util.List;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import edu.pe.cibertec.spring.model.Medico;
//import edu.pe.cibertec.spring.service.MedicoService;
//import edu.pe.cibertec.spring.service.UsuarioService;
//
//@Controller
//public class UsuarioController {
//
//	
//	UsuarioService usuarioservice= new UsuarioService();
//	
//	
//	@RequestMapping(value = "/ListarUsuario", method = RequestMethod.GET, headers = "Accept=application/json")	
//	public String Listar(Model model) {
//		List listOfusuario = usuarioservice.ListarUsuario();
//		model.addAttribute("usuario", new Medico());
//		model.addAttribute("listOfusuario", listOfusuario);
//		return "Usuario";
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
