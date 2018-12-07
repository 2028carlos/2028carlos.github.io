package edu.pe.cibertec.spring.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Connection;

import edu.pe.cibertec.spring.model.Cita;
import edu.pe.cibertec.spring.model.CitasActuales;
import edu.pe.cibertec.spring.util.ConexionDB;

@Repository
public class CitaDAO   {

private ConexionDB cnx;
	
	public CitaDAO(){		
		 this.cnx = new ConexionDB();
	}
	
	
	
	

	public Cita insertaCita(Cita c) {
		//Session session = sessionFactory.getCurrentSession();
		
		Cita result = null;
			Connection cn = (Connection) cnx.getConexion();
			
			//codigo para llamar a un SP de mysql: sp_insertar_usuario
			try {
				CallableStatement cs = cn.prepareCall("{call sp_cita_insert(?,?,?,?,?,?,?,?,?)}");
//			
				int i=1;
				
			
				cs.setInt(i++, c.getTipo());
				cs.setString(i++, c.getNumdoc());
				cs.setString(i++, c.getNom());
				cs.setString(i++, c.getApe());
				cs.setString(i++, c.getTel());
				cs.setString(i++, c.getDir());
			    cs.setString(i++, c.getNac());
				cs.setString(i++, c.getGen());
				cs.setString(i++, c.getFecita());
				
				
			
				
				
				//devuelve la cantidad de registro afectados
				int cant = cs.executeUpdate(); 
				if(cant == 0) {
					result = null;
				}else {
					//objPaciente.setMsj("0007");
					
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

	
	
	//Metod de listar Usuarios
			public List<CitasActuales> getAllCitas(){
				List<CitasActuales> lista = new ArrayList<CitasActuales>();
				Connection cn = (Connection) cnx.getConexion();
				
				try {
					CallableStatement cs = cn.prepareCall("{call sp_cita_lista()}");
					ResultSet rs = cs.executeQuery();
					
					while(rs.next()) {
						CitasActuales usuario = new CitasActuales();
						usuario.setCitaid(rs.getInt(1));
						usuario.setFechacita(rs.getString(2));
						usuario.setNombre(rs.getString(3));
						usuario.setApellido(rs.getString(4));
						usuario.setTelefono(rs.getString(5));
						usuario.setDireccion(rs.getString(6));
						usuario.setGenero(rs.getString(7));
						usuario.setFechanac(rs.getString(8));
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
