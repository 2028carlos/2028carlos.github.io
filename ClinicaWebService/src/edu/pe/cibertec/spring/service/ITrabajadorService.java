package edu.pe.cibertec.spring.service;


import java.util.List;

import edu.pe.cibertec.spring.model.Trabajador;

public interface ITrabajadorService {
	
	
	public void insertarTrabajador(Trabajador p) throws Exception;
	public List<Trabajador> listarAll();
}
