package edu.pe.cibertec.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.pe.cibertec.spring.dao.CitaDAO;
import edu.pe.cibertec.spring.model.Cita;
import edu.pe.cibertec.spring.model.CitasActuales;


@Service
public class CitaService implements ICitaSevcice {

	private CitaDAO citaDAO;
	
	@Override
	@Transactional
	public void insertaCita(Cita c) throws Exception {
		// TODO Auto-generated method stub
		citaDAO.insertaCita(c);
	}

	

	
	@Override
	@Transactional
	public List<CitasActuales> getAllCitas() {
		// TODO Auto-generated method stub
		return citaDAO.getAllCitas();
	}
	
	
	
	
	
	
	
	
	
	
	public CitaDAO getCitaDAO() {
		return citaDAO;
	}
	@Autowired(required=true)
	public void setCitaDAO(CitaDAO citaDAO) {
		this.citaDAO = citaDAO;
	}










	



	


}
