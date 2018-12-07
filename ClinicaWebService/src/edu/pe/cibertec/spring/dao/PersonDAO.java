	package edu.pe.cibertec.spring.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.pe.cibertec.spring.model.PersonBean;
import edu.pe.cibertec.spring.util.ConexionDB;






@Repository
public class PersonDAO {
	private ConexionDB cnx;
	
	public PersonDAO() {
		this.cnx = new ConexionDB();
	}
	
	public PersonBean insertarUsuario(PersonBean objPerson) {
		PersonBean result = null;
		
		Connection cn = cnx.getConexion();
		//codigo para llamar a un SP de mysql: sp_insertar_usuario
		try {
			CallableStatement cs = cn.prepareCall("{call sp_insertar(?,?)}");
			int i=1;
			
			cs.setString(i++, objPerson.getName());
			cs.setString(i++, objPerson.getCountry());
			
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
	public List<PersonBean> listarAll(){
		List<PersonBean> lista = new ArrayList<PersonBean>();
		Connection cn = cnx.getConexion();
		
		try {
			CallableStatement cs = cn.prepareCall("{call listaPerson()}");
			ResultSet rs = cs.executeQuery();
			
			while(rs.next()) {
				PersonBean usuario = new PersonBean();
				usuario.setId(rs.getInt(1));
				usuario.setName(rs.getString(2));
				usuario.setCountry(rs.getString(3));
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
