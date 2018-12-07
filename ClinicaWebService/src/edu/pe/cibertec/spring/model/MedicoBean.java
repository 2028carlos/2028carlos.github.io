package edu.pe.cibertec.spring.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medico")
public class MedicoBean implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer MEDICOID;
	
	
	private Date FECHACREACION;
	
	private String Dni;
	
	private String nombre;
	
	private String apellido;
	
	private Integer Servicioid;

	

	public MedicoBean() {
	
	}

	
	
	
	
	
	public Integer getMEDICOID() {
		return MEDICOID;
	}

	public void setMEDICOID(Integer mEDICOID) {
		MEDICOID = mEDICOID;
	}

	public Date getFECHACREACION() {
		return FECHACREACION;
	}

	public void setFECHACREACION(Date fECHACREACION) {
		FECHACREACION = fECHACREACION;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getServicioid() {
		return Servicioid;
	}

	public void setServicioid(Integer servicioid) {
		Servicioid = servicioid;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
