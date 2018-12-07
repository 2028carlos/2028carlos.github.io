package edu.pe.cibertec.spring.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.pe.cibertec.spring.model.UsuarioBean;
import edu.pe.cibertec.spring.util.ConexionDB;


@Repository
public class UsuarioDAO {

	private ConexionDB cnx;

	public ConexionDB getCnx() {
		return cnx;
	}

	public UsuarioDAO() {
		this.cnx = new ConexionDB();
	}
	
	public UsuarioBean insertarUsuario(UsuarioBean objusuario) {
		
	UsuarioBean result = null;
		
		Connection cn = cnx.getConexion();
		//codigo para llamar a un SP de mysql: sp_insertar_usuario
		try {
			CallableStatement cs = cn.prepareCall("{call sp_usuarioinsertar(?,?,?,?,?)}");
			int i=1;
			cs.setString(i++,objusuario.getEMAIL());
			cs.setString(i++,objusuario.getPASSWORD());
			cs.setString(i++,objusuario.getNOMBRE());
			cs.setString(i++,objusuario.getUSUARIO());
			cs.setInt(i++,objusuario.getROLESID());
			
			//devuelve la cantidad de registro afectados
			int cant = cs.executeUpdate(); 
			if(cant == 0) {
				result = null;
			}else {
				result = objusuario;
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
	
	public List<UsuarioBean> listarAll(){
		List<UsuarioBean> lista = new ArrayList<UsuarioBean>();
		Connection cn = cnx.getConexion();
		
		try {
			CallableStatement cs = cn.prepareCall("{call sp_listarUsuarios()}");
			ResultSet rs = cs.executeQuery();
			
			while(rs.next()) {
				UsuarioBean usuario = new UsuarioBean();
				usuario.setUSUARIOID(rs.getInt(1));
				usuario.setEMAIL(rs.getString(2));
				usuario.setPASSWORD(rs.getString(3));
				usuario.setNOMBRE(rs.getString(4));
				usuario.setUSUARIO(rs.getString(5));
				usuario.setUSUARIOID(rs.getInt(6));
				
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
