package edu.pe.cibertec.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trabajador")
public class Trabajador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7223203759398726086L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int TRABAJADORID;
	private String NOMBRE;
	private String APELLIDOS;
	private int DNI;
	private String  DIRECCION;
	private int CELULAR;
	private String TELEFONO;
	
	
	
	public int getTRABAJADORID() {
		return TRABAJADORID;
	}
	public void setTRABAJADORID(int tRABAJADORID) {
		TRABAJADORID = tRABAJADORID;
	}
	public String getNOMBRE() {
		return NOMBRE;
	}
	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}
	public String getAPELLIDOS() {
		return APELLIDOS;
	}
	public void setAPELLIDOS(String aPELLIDOS) {
		APELLIDOS = aPELLIDOS;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public String getDIRECCION() {
		return DIRECCION;
	}
	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}
	public int getCELULAR() {
		return CELULAR;
	}
	public void setCELULAR(int cELULAR) {
		CELULAR = cELULAR;
	}
	public String getTELEFONO() {
		return TELEFONO;
	}
	public void setTELEFONO(String tELEFONO) {
		TELEFONO = tELEFONO;
	}
	
	
	
	
	
}
