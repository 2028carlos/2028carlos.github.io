package edu.pe.cibertec.spring.service;

import java.util.List;

import edu.pe.cibertec.spring.model.Paciente;



public interface IPacienteService {

	public void registroPaciente(Paciente p) throws Exception;
	public List<Paciente> ListaPaciente();
	public Paciente ListarPacienteXDNI(String dni);
}
