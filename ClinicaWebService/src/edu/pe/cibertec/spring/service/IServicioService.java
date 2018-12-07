package edu.pe.cibertec.spring.service;

import java.util.List;

import edu.pe.cibertec.spring.model.Servicio;



public interface IServicioService {
	public void registro(Servicio p) throws Exception;
	public List getAllServicio();
}
