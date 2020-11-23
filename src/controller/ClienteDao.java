package controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entity.Cliente;

@Repository
public class ClienteDao implements IClienteDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Cliente> getClientes(){
		Session mySession = sessionFactory.getCurrentSession();
		Query<Cliente> myQuery = mySession.createQuery("from Cliente", Cliente.class);
		List<Cliente> misClientes = myQuery.getResultList();
		return misClientes;
	}
	
}
