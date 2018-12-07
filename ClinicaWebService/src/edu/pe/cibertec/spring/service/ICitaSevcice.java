package edu.pe.cibertec.spring.service;

import java.util.List;

import edu.pe.cibertec.spring.model.Cita;
import edu.pe.cibertec.spring.model.CitasActuales;
import edu.pe.cibertec.spring.model.Paciente;

public interface ICitaSevcice {

	public List<CitasActuales> getAllCitas();
	public void insertaCita(Cita c) throws Exception;
}
