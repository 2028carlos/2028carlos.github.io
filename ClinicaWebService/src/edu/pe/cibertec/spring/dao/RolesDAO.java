package edu.pe.cibertec.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.pe.cibertec.spring.model.Roles;





@Repository
public class RolesDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
 
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	public List ListarRoles() {
		Session session = this.sessionFactory.getCurrentSession();
		List rolesList = session.createQuery("from Roles").list();
		return rolesList;
	}
 
	public Roles BuscarRoles(int rolesid) {
		Session session = this.sessionFactory.getCurrentSession();
		Roles roles = (Roles) session.get(Roles.class, new Integer(rolesid));
		return roles;
	}
 
	public Roles GuardarRoles(Roles roles) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(roles);
		return roles;
	}
 
	public void updateRoles(Roles roles) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(roles);
	}
 
	public void deleteRoles(int rolesid) {
		Session session = this.sessionFactory.getCurrentSession();
		Roles p = (Roles) session.load(Roles.class, new Integer(rolesid));
		if (null != p) {
			session.delete(p);
		}
	}
}