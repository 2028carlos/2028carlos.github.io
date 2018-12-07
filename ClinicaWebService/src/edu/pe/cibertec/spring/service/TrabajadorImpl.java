package edu.pe.cibertec.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.pe.cibertec.spring.dao.TrabajadorDAO;
import edu.pe.cibertec.spring.model.Trabajador;



@Service
public class TrabajadorImpl implements ITrabajadorService {

private TrabajadorDAO trabajadorDAO;

	
	

	@Override
	@Transactional
	

	public void insertarTrabajador(Trabajador p) throws Exception {
		// TODO Auto-generated method stub
		trabajadorDAO.insertarTrabajador(p);
	}

	@Override
	@Transactional
	public List<Trabajador> listarAll() {
		// TODO Auto-generated method stub
		return trabajadorDAO.listarAll();
	}

	
	
	
	public TrabajadorDAO getTrabajadorDAO() {
		return trabajadorDAO;
	}
	@Autowired(required=true)
	public void setTrabajadorDAO(TrabajadorDAO trabajadorDAO) {
		this.trabajadorDAO = trabajadorDAO;
	}





	

}
