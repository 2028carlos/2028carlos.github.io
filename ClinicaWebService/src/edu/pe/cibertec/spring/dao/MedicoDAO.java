package edu.pe.cibertec.spring.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.pe.cibertec.spring.model.MedicoBean;
import edu.pe.cibertec.spring.util.ConexionDB;


@Repository
public class MedicoDAO {

	private ConexionDB cnx;

	public ConexionDB getCnx() {
		return cnx;
	}

	public MedicoDAO() {
		this.cnx = new ConexionDB();
	}
	
	public MedicoBean insertarMedico(MedicoBean objMedico) {
		
		MedicoBean result = null;
		
		Connection cn = cnx.getConexion();
		//codigo para llamar a un SP de mysql: sp_insertar_usuario
		try {
			CallableStatement cs = cn.prepareCall("{call sp_registrarMedico(?,?,?,?,?)}");
			int i=1;
			cs.setDate(i++,objMedico.getFECHACREACION());
			cs.setString(i++,objMedico.getDni());
			cs.setString(i++,objMedico.getNombre());
			cs.setString(i++,objMedico.getApellido());
			cs.setInt(i++, objMedico.getServicioid());
			
			//devuelve la cantidad de registro afectados
			int cant = cs.executeUpdate(); 
			if(cant == 0) {
				result = null;
			}else {
				result = objMedico;
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
	
	
	
	public List<MedicoBean> listarAll(){
		List<MedicoBean> lista = new ArrayList<MedicoBean>();
		Connection cn = cnx.getConexion();
		
		try {
			CallableStatement cs = cn.prepareCall("{call sp_listarMedicos()}");
			ResultSet rs = cs.executeQuery();
			
			while(rs.next()) {
				
				MedicoBean medico = new MedicoBean();
				medico.setMEDICOID(rs.getInt(1));
				medico.setFECHACREACION(rs.getDate(2));
				medico.setDni(rs.getString(3));
				medico.setNombre(rs.getString(4));
				medico.setApellido(rs.getString(5));
				medico.setServicioid(rs.getInt(6));
				
				lista.add(medico);
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
