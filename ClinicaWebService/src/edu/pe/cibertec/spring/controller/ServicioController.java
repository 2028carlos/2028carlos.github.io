package edu.pe.cibertec.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import edu.pe.cibertec.spring.model.Servicio;
import edu.pe.cibertec.spring.service.IServicioService;
import edu.pe.cibertec.spring.service.ServicioService;



@Controller

public class ServicioController {

 IServicioService servicio;

	
	public IServicioService getServicio() {
	return servicio;
}




	@Autowired(required=true)
public void setServicio(IServicioService servicio) {
	this.servicio = servicio;
}





	@RequestMapping(value="/servicio",method = RequestMethod.GET, headers = "Accept=application/json")
	public String inicio(Model model){
		
   List listaServicio =servicio.getAllServicio();
		model.addAttribute("servicio", new Servicio());	
	model.addAttribute("listaServicio",listaServicio);

	return "Servicio"; // 
}
	
	

	

	@RequestMapping(value = "/registraServicio", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addPerson(@ModelAttribute("person") Servicio person) throws Exception {	
		if(person.getServicioid() == null || person.getServicioid()==0)
		{
			servicio.registro(person);
		}
		else
		{	
			//servicio.ActualizaServicio(person);
		}
 
		return "redirect:/servicio";
	}

	
//	@RequestMapping(value = "/eliminarServicio", method = RequestMethod.POST, headers = "Accept=application/json")
//	public String eliminarServicio(@ModelAttribute("person") Servicio person) {	
//		
//			servicio.EliminarServicio(person);
//	
// 
//		return "redirect:/servicio";
//	}

	
//	@RequestMapping(value = "/eliminarServicio/{id}", method = RequestMethod.POST, headers = "Accept=application/json")
//	public Servicio getPersonById(@PathVariable int id) {
//		Servicio s;
//		return servicio.EliminarServicio(id);
//	}
	
	
	
	
}
