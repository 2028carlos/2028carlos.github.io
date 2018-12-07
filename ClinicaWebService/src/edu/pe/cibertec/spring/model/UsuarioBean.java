package edu.pe.cibertec.spring.model;

import java.io.Serializable;

public class UsuarioBean implements Serializable{

	private static final long serialVersionUID = -7951917002155701086L;

	private Integer USUARIOID;
	
	private String EMAIL;
	
	private String PASSWORD;
	
	
	private String NOMBRE;
	
	private String USUARIO;
	
	private Integer ROLESID;

	
	public UsuarioBean() {
		
	}
	
	
	public Integer getUSUARIOID() {
		return USUARIOID;
	}

	public void setUSUARIOID(Integer uSUARIOID) {
		USUARIOID = uSUARIOID;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public String getUSUARIO() {
		return USUARIO;
	}

	public void setUSUARIO(String uSUARIO) {
		USUARIO = uSUARIO;
	}

	public Integer getROLESID() {
		return ROLESID;
	}

	public void setROLESID(Integer rOLESID) {
		ROLESID = rOLESID;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
