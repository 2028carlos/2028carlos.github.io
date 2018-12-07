package edu.pe.cibertec.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.pe.cibertec.spring.model.Paciente;
import edu.pe.cibertec.spring.model.Servicio;
import edu.pe.cibertec.spring.service.IPacienteService;
import edu.pe.cibertec.spring.service.PacienteService;

@Controller
public class PacienteController {


	IPacienteService pacieneservice;
	
	


	public IPacienteService getPacieneservice() {
		return pacieneservice;
	}

	@Autowired(required=true)
	public void setPacieneservice(IPacienteService pacieneservice) {
		this.pacieneservice = pacieneservice;
	}


	@RequestMapping(value="/paciente",method = RequestMethod.GET, headers = "Accept=application/json")
	public String inicio(Model model){
		
   List listaPaciente =pacieneservice.ListaPaciente();
		model.addAttribute("paciente", new Paciente());	
	model.addAttribute("listaPaciente",listaPaciente);

	return "Paciente"; // 
}
	

	@RequestMapping(value = "/registraPaciente", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addPaciente(@ModelAttribute("person") Paciente person) throws Exception {	
		if(person.getPacienteid() == null || person.getPacienteid()==0)
		{
			pacieneservice.registroPaciente(person);
		}
		else
		{	
			//servicio.ActualizaServicio(person);
		}
 
		return "redirect:/paciente";
	}

}
