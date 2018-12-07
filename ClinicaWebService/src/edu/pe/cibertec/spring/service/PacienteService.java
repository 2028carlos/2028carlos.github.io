package edu.pe.cibertec.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.pe.cibertec.spring.dao.PacienteDAO;
import edu.pe.cibertec.spring.model.Paciente;




@Service
public class PacienteService implements IPacienteService  {

	private PacienteDAO pacienteDAO;
	

	@Override
	@Transactional
	public void registroPaciente(Paciente p) throws Exception {
		pacienteDAO.registroPaciente(p);	
	}

	
	
//Lista 
	@Override
	@Transactional
	public List<Paciente> ListaPaciente() {
		return pacienteDAO.ListaPaciente();
		
	}
	

	@Override
	@Transactional
	public Paciente ListarPacienteXDNI(String dni) {
	Paciente objpaciente = new Paciente();
		
		objpaciente.setNumdocumento(dni);
		return pacienteDAO.ListarPacienteXDNI(objpaciente);
	}

	
	
	
	

	public PacienteDAO getPacienteDAO() {
		return pacienteDAO;
	}

	@Autowired(required=true)
	public void setPacienteDAO(PacienteDAO pacienteDAO) {
		this.pacienteDAO = pacienteDAO;
	}




	
	
	

}
