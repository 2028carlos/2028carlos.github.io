	package edu.pe.cibertec.spring.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.pe.cibertec.spring.model.Servicio;
import edu.pe.cibertec.spring.util.ConexionDB;






@Repository
public class ServicioDAO   {
private ConexionDB cnx;
private static ConexionDB cn;
	public ServicioDAO() {
		this.cnx = new ConexionDB();
	}
	
		
	
	
	public Servicio registroServicio(Servicio objPerson) {
		Servicio result = null;
		
		Connection cn = cnx.getConexion();
		//codigo para llamar a un SP de mysql: sp_insertar_usuario
		try {
			CallableStatement cs = cn.prepareCall("{call sp_sevicios_insert(?,?)}");
			int i=1;
			
			cs.setString(i++, objPerson.getNombre());
			cs.setString(i++, objPerson.getDescripcion());
			
			//devuelve la cantidad de registro afectados
			int cant = cs.executeUpdate(); 
			if(cant == 0) {
				result = null;
			}else {
				result = objPerson;
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
		public List<Servicio> getAllServicio(){
			List<Servicio> lista = new ArrayList<Servicio>();
			Connection cn = cnx.getConexion();
			
			try {
				CallableStatement cs = cn.prepareCall("{call sp_servicio_list()}");
				ResultSet rs = cs.executeQuery();
				
				while(rs.next()) {
					Servicio usuario = new Servicio();
					usuario.setServicioid(rs.getInt(1));
					usuario.setNombre(rs.getString(2));
					usuario.setDescripcion(rs.getString(3));
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
		
		
		public Servicio actualizarServicio(Servicio objPro) {
			Servicio result = null;
			
			Connection cn = cnx.getConexion();
			//codigo para llamar a un SP de mysql: sp_insertar_usuario
			try {
				CallableStatement cs = cn.prepareCall("{call sp_servicios_update(?,?,?)}");
				int i=1;
				cs.setInt(i++,objPro.getServicioid());
				cs.setString(i++, objPro.getNombre());
				cs.setString(i++, objPro.getDescripcion());
				
			
				//devuelve la cantidad de registro afectados
				int cant = cs.executeUpdate(); 
				if(cant == 0) {
					result = null;
				}else {
					result = objPro;
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
		
		
		
		public Servicio EliminarServicio(Servicio objPro) {
			Servicio result = null;
			
			Connection cn = cnx.getConexion();
			//codigo para llamar a un SP de mysql: sp_insertar_usuario
			try {
				CallableStatement cs = cn.prepareCall("{call sp_servicios_delete(?)}");
				int i=1;
				cs.setInt(i++,objPro.getServicioid());
				
				//devuelve la cantidad de registro afectados
				int cant = cs.executeUpdate(); 
				if(cant == 0) {
					result = null;
				}else {
					result = objPro;
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
