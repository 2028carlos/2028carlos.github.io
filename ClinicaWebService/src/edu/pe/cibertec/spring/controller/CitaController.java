package edu.pe.cibertec.spring.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.pe.cibertec.spring.model.CitasActuales;
import edu.pe.cibertec.spring.model.Servicio;
import edu.pe.cibertec.spring.service.ICitaSevcice;




@Controller
public class CitaController {
	
	ICitaSevcice citasservice;
	
	public ICitaSevcice getCitasservice() {
		return citasservice;
	}
	@Autowired(required=true)
	public void setCitasservice(ICitaSevcice citasservice) {
		this.citasservice = citasservice;
	}

	@RequestMapping(value="/citas",method = RequestMethod.GET, headers = "Accept=application/json")
	public String citasController(Model model){
		
   List listaCita =citasservice.getAllCitas();
		model.addAttribute("citasActuales", new CitasActuales());	
	model.addAttribute("listaCita",listaCita);

	return "Citas"; // 
}
	
	
}
