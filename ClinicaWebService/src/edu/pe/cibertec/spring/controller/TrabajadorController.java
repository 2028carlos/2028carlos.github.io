package edu.pe.cibertec.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.pe.cibertec.spring.model.CitasActuales;
import edu.pe.cibertec.spring.model.Trabajador;
import edu.pe.cibertec.spring.service.ITrabajadorService;
import edu.pe.cibertec.spring.service.TrabajadorImpl;


@Controller
public class TrabajadorController {

ITrabajadorService trabajadorservice;
	
	public ITrabajadorService getTrabajadorservice() {
	return trabajadorservice;
}
	@Autowired(required=true)
public void setTrabajadorservice(ITrabajadorService trabajadorservice) {
	this.trabajadorservice = trabajadorservice;
}

	@RequestMapping(value="/trabajador",method = RequestMethod.GET, headers = "Accept=application/json")
	public String citasController(Model model){
		
   List listaTrabajador =trabajadorservice.listarAll();
		model.addAttribute("Trabajador", new Trabajador());	
	model.addAttribute("listaTrabajador",listaTrabajador);

	return "Trabajador"; // 
}
	
}
