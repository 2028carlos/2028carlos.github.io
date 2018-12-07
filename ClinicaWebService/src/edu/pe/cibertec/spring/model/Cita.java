package edu.pe.cibertec.spring.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cita")
public class Cita   {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer  citaid ;
	private int tipo ;
	private String numdoc;
	private String nom ;
	private String ape ;
	private String tel;
	private String dir ;
	private String  nac ;
	private String  gen;
	private String fecita ;
	
	
	
	
	
	
	
	public Integer getCitaid() {
		return citaid;
	}
	public void setCitaid(Integer citaid) {
		this.citaid = citaid;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNumdoc() {
		return numdoc;
	}
	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getApe() {
		return ape;
	}
	public void setApe(String ape) {
		this.ape = ape;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getNac() {
		return nac;
	}
	public void setNac(String nac) {
		this.nac = nac;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getFecita() {
		return fecita;
	}
	public void setFecita(String fecita) {
		this.fecita = fecita;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
