package edu.pe.cibertec.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int usuarioid;
	private String email;
	private String password;
	private String nombre;
	private String usuario;
	private String rolesid;
	
	
	
	public Usuario() {
	
	}
	public int getUsuarioid() {
		return usuarioid;
	}
	public void setUsuarioid(int usuarioid) {
		this.usuarioid = usuarioid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getRolesid() {
		return rolesid;
	}
	public void setRolesid(String rolesid) {
		this.rolesid = rolesid;
	}
	
	

}
