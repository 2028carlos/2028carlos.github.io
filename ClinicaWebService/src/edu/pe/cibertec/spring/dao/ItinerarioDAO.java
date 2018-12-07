package edu.pe.cibertec.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.pe.cibertec.spring.model.Itinerario;




@Repository
public class ItinerarioDAO {
	@Autowired
	private SessionFactory sessionFactory;
 
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	public List ListarItinerario() {
		Session session = this.sessionFactory.getCurrentSession();
		List itinerarioList = session.createQuery("from Itinerario").list();
		return itinerarioList;
	}
 
	public Itinerario BuscarItinerario(int itinerarioid) {
		Session session = this.sessionFactory.getCurrentSession();
		Itinerario itinerario = (Itinerario) session.get(Itinerario.class, new Integer(itinerarioid));
		return itinerario;
	}
 
	public Itinerario GuardarItinerario(Itinerario itinerario) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(itinerario);
		return itinerario;
	}
 
	public void updateItinerario(Itinerario itinerario) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(itinerario);
	}
 
	public void deleteItinerario(int itinerarioid) {
		Session session = this.sessionFactory.getCurrentSession();
		Itinerario p = (Itinerario) session.load(Itinerario.class, new Integer(itinerarioid));
		if (null != p) {
			session.delete(p);
		}
	}
}
