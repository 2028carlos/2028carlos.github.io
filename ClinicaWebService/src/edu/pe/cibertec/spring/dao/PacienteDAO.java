	package edu.pe.cibertec.spring.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.pe.cibertec.spring.model.Paciente;
import edu.pe.cibertec.spring.util.ConexionDB;








@Repository
public class PacienteDAO   {

	private ConexionDB cnx;
	private static ConexionDB cn;
		public PacienteDAO() {
			this.cnx = new ConexionDB();
		}
		
		

		public Paciente registroPaciente(Paciente c) {
			Paciente result = null;
			
			Connection cn = cnx.getConexion();
			//codigo para llamar a un SP de mysql: sp_insertar_usuario
			try {
				CallableStatement cs = cn.prepareCall("{call sp_paciente_insert(?,?,?,?,?,?,?,?,?)}");
				int i=1;
					
				cs.setInt(i++, c.getTipodocumento());
				cs.setString(i++, c.getNumdocumento());
				cs.setString(i++, c.getFechacreacion());
				cs.setString(i++, c.getNombre());
				cs.setString(i++, c.getApellido());
				cs.setString(i++, c.getTelefono());
				cs.setString(i++, c.getDireccion());
			    cs.setString(i++, c.getFechanac());
				cs.setString(i++, c.getGenero());
				
				
				//devuelve la cantidad de registro afectados
				int cant = cs.executeUpdate(); 
				if(cant == 0) {
					result = null;
				}else {
					result = c;
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
		
		
		
		
		


	public List<Paciente> ListaPaciente() {
		List<Paciente> lista = new ArrayList<Paciente>();
	
		Connection cn = cnx.getConexion();
		//codigo para llamar a un SP de mysql: sp_insertar_usuario
		try {
			CallableStatement cs = cn.prepareCall("{call sp_list_paciente()}");
			ResultSet rs = cs.executeQuery();
			
			while(rs.next()) {
				Paciente result = new Paciente();
				result.setPacienteid(rs.getInt(1));
				result.setTipodocumento(rs.getInt(2));
				result.setNumdocumento(rs.getString(3));
				result.setFechacreacion(rs.getString(4));
				result.setNombre(rs.getString(5));
				result.setApellido(rs.getString(6));
				result.setTelefono(rs.getString(7));
				result.setDireccion(rs.getString(8));
				result.setFechanac(rs.getString(9));
				result.setGenero(rs.getString(10));
				
				
				
				lista.add(result);
			}
		
			
			rs.close();
			cs.close();
			cn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	
	
	
	
	

	public Paciente ListarPacienteXDNI(Paciente objPaciente) {
		Paciente result = null;
		Connection cn =  cnx.getConexion();
		
		//codigo para llamar a un SP de mysql: sp_insertar_usuario
		try {
			CallableStatement cs = cn.prepareCall("{call sp_paciente_buscarbydni(?)}");
			int i=1;
			result =  new Paciente();
			cs.setString(i++, result.getNumdocumento());
			
			
			cs.execute();
			
			ResultSet rs = cs.getResultSet();  
			
			
			
			
			if(rs.next()) {  
				result.setPacienteid(rs.getInt(1));
				result.setTipodocumento(rs.getInt(2));
				result.setNumdocumento(rs.getString(3));
				result.setFechacreacion(rs.getString(4));
				result.setNombre(rs.getString(5));
				result.setApellido(rs.getString(6));
				result.setTelefono(rs.getString(7));
				result.setDireccion(rs.getString(8));
				result.setFechanac(rs.getString(9));
				result.setGenero(rs.getString(10));
				
			    }    
			
			else {
				result=null;
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

	
	
}
