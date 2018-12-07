package edu.pe.cibertec.spring.model;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="servicio")
public class Servicio implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -2661919171552285536L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer servicioid;
	
	private String nombre;
	
	private String descripcion;
	
	//private String msj ;
	
	 public Servicio() {
			
		}

	public Integer getServicioid() {
		return servicioid;
	}

	public void setServicioid(Integer servicioid) {
		this.servicioid = servicioid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
	
	
	
	
	

	
	
	
	
	
	
	
}

