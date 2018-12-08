package edu.pe.cibertec.spring.service;

import java.sql.SQLException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.cibertec.spring.dao.UsuarioDAO;
import edu.pe.cibertec.spring.model.Usuario;



@Service("usuarioService")
public class UsuarioService   {
	@Autowired
	 UsuarioDAO usuarioDAO;

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}
	@Autowired(required=true)
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	
	@Transactional
	public void addUsuario(Usuario usuario) {
		usuarioDAO.addUsuario(usuario);
	}

	@Transactional
	public Usuario getEmployee(Usuario usuario) {
		
		return usuarioDAO.validarLogin(usuario);
	}
	
}
