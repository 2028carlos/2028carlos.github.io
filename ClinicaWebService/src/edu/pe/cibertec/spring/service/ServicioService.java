package edu.pe.cibertec.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.pe.cibertec.spring.dao.ServicioDAO;
import edu.pe.cibertec.spring.model.Servicio;


@Service
public class ServicioService  implements IServicioService{

	private ServicioDAO serviceDAO;
	
	
	@Override
	@Transactional
	public void registro(Servicio p) throws Exception {
		serviceDAO.registroServicio(p);
		
	}
	@Override
	@Transactional
	public List getAllServicio() {
		// TODO Auto-generated method stub
		return serviceDAO.getAllServicio();
	}
	
	public ServicioDAO getServicioDAO() {
		return serviceDAO;
	}
	@Autowired(required=true)
	public void setServicioDAO(ServicioDAO serviceDAO) {
		this.serviceDAO = serviceDAO;
	}


	
	
	
	
	
}
