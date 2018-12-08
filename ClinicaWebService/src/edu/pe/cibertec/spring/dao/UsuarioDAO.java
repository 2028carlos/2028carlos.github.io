package edu.pe.cibertec.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.management.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.StatementImpl;

import edu.pe.cibertec.spring.model.Usuario;



@Repository
public class UsuarioDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
 
	
//	
//	public List getAllPersons() {
//		Session session = this.sessionFactory.getCurrentSession();
//		List personList = session.createQuery("from Usuario").list();
//		return personList;
//	}
// 
	

 
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	@Autowired(required=true)
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public Usuario addUsuario(Usuario usuario) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(usuario);
	
		return usuario;
	}
	
	
	public Usuario validarLogin(Usuario usuario) {
		Session session = sessionFactory.openSession();
		Criteria criteria = null;
		Usuario emp = null;
		try {
			criteria = session.createCriteria(Usuario.class);
			Criterion criterion = Restrictions.eq("usuario",usuario.getUsuario()),
						criterion2 = Restrictions.eq("password", usuario.getPassword());
			//Criterion	criterion=Restrictions.eqProperty(usuario.getUsuario(), usuario.getPassword());
			
			criteria.add(criterion);
			criteria.add(criterion2);
			criteria.setMaxResults(1);
			emp = (Usuario) criteria.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return emp;
	
		
		
		
		
		

//String query = "Select count(1) from user where username = ? and password = ?";  
//        PreparedStatement pstmt = (PreparedStatement) ((PreparedStatement) ( sessionFactory)).getConnection().prepareStatement(query); 
//        pstmt.setString(1, usuario); 
//        pstmt.setString(2, password); 
//        ResultSet resultSet = pstmt.executeQuery(); 
//        if(resultSet.next()) 
//            return (resultSet.getInt(1) > 0); 
//        else 
//           return false; 
      }


	

		
	
	
}