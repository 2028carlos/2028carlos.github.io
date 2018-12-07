//package edu.pe.cibertec.spring.controller;
//
//import java.util.List;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import edu.pe.cibertec.spring.model.Itinerario;
//import edu.pe.cibertec.spring.model.Medico;
//import edu.pe.cibertec.spring.service.MedicoService;
//
//@Controller
//public class MedicoController {
//
//	MedicoService medicoservice= new MedicoService();
//	
//	
//	@RequestMapping(value = "/ListarMedico", method = RequestMethod.GET, headers = "Accept=application/json")
//	public String Listar(Model model) {
// 
//		List listOfmedico = medicoservice.ListarMedico();
//		model.addAttribute("medico", new Medico());
//		model.addAttribute("listOfmedico", listOfmedico);
//		return "Medico";
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//}
