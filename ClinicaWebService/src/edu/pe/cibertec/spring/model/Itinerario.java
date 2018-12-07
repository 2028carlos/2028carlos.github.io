package edu.pe.cibertec.spring.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itinerario")
public class Itinerario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itinerarioid;
	private Date fecha;
	private Time hora;
	
	
	public Itinerario() {
	
	}
	public int getItinerarioid() {
		return itinerarioid;
	}
	public void setItinerarioid(int itinerarioid) {
		this.itinerarioid = itinerarioid;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	
	

}



