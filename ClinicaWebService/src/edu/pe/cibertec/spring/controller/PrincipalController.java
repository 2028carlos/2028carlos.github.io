package edu.pe.cibertec.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.pe.cibertec.spring.model.Cita;
import edu.pe.cibertec.spring.service.CitaService;
import edu.pe.cibertec.spring.service.ICitaSevcice;



@Controller
public class PrincipalController {
	
	ICitaSevcice citasservice;
	
	
	
	
	
	
	
	
	public ICitaSevcice getCitasservice() {
		return citasservice;
	}

	@Autowired(required=true)
	public void setCitasservice(ICitaSevcice citasservice) {
		this.citasservice = citasservice;
	}






	@RequestMapping(value="/principal")
	public String inicio(Model model){
		
		//Es similiar al request en el servlet
		//request.setAtribute();
		//model.addAttribute("login", new Login());
		
		//Segun el spring
		//person ----> /WEB-INF/views/person.jsp
		return "Principal"; // 
	}
	

	
		
		

		@RequestMapping(value = "/registraCita", method = RequestMethod.POST, headers = "Accept=application/json")
		public String addCita(@ModelAttribute("person") Cita person) throws Exception {	
			if(person.getCitaid() == null || person.getCitaid()==0)
			{
			citasservice.insertaCita(person);
			}
			else
			{	
				//servicio.ActualizaServicio(person);
			}
	 
			return "redirect:/principal";
		}
}
