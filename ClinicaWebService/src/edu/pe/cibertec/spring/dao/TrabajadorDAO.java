package edu.pe.cibertec.spring.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.pe.cibertec.spring.model.Trabajador;
import edu.pe.cibertec.spring.util.ConexionDB;


@Repository
public class TrabajadorDAO {

	
private ConexionDB cnx;
	
	public TrabajadorDAO() {
		this.cnx = new ConexionDB();
	}
	
	public Trabajador insertarTrabajador(Trabajador objTrab) {
		Trabajador result = null;
		
		Connection cn = cnx.getConexion();
		//codigo para llamar a un SP de mysql: sp_insertar_usuario
		try {
			CallableStatement cs = cn.prepareCall("{call Insert_Trabajador(?,?,?,?,?,?)}");
			int i=1;
			
			cs.setString(i++, objTrab.getNOMBRE());
			cs.setString(i++, objTrab.getAPELLIDOS());
			cs.setInt(i++,  objTrab.getDNI());
			cs.setString(i++, objTrab.getDIRECCION());
			cs.setInt(i++,  objTrab.getCELULAR());
			cs.setString(i++, objTrab.getTELEFONO());
			
			
			
			//devuelve la cantidad de registro afectados
			int cant = cs.executeUpdate(); 
			if(cant == 0) {
				result = null;
			}else {
				result = objTrab;
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
		}finally {
			try {
				cn.close();
			}catch (SQLException e) {
				e.printStackTrace();
				result = null;
			}
		}
		return result;
	}
	
	//Metod de listar Usuarios
	public List<Trabajador> listarAll(){
		List<Trabajador> lista = new ArrayList<Trabajador>();
		Connection cn = cnx.getConexion();
		
		try {
			CallableStatement cs = cn.prepareCall("{call list_Trabajador()}");
			ResultSet rs = cs.executeQuery();
			
			while(rs.next()) {
				Trabajador usuario = new Trabajador();
				usuario.setTRABAJADORID(rs.getInt(1));
				usuario.setNOMBRE(rs.getString(2));
				usuario.setAPELLIDOS(rs.getString(3));
				usuario.setDNI(rs.getInt(4));
				usuario.setDIRECCION(rs.getString(5));
				usuario.setCELULAR(rs.getInt(6));
				usuario.setTELEFONO(rs.getString(7));
				
				
				lista.add(usuario);
			}
			rs.close();
			cs.close();
			cn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
}

	
	
	
	
	
	

