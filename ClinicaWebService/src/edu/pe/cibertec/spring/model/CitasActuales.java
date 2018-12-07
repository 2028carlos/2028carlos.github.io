package edu.pe.cibertec.spring.model;

import javax.persistence.Entity;

@Entity
public class CitasActuales {

	
	private int   citaid;
	private String fechacita ;
	private String nombre ;
	private String apellido ;
	private String telefono ;
	private String direccion ;
	
	private String genero ;
	private String fechanac ;
	
	
	
	
	public int getCitaid() {
		return citaid;
	}
	public void setCitaid(int citaid) {
		this.citaid = citaid;
	}
	public String getFechacita() {
		return fechacita;
	}
	public void setFechacita(String fechacita) {
		this.fechacita = fechacita;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getFechanac() {
		return fechanac;
	}
	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}
	
	
	
	
}
