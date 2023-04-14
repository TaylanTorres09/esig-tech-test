package br.com.esig.models.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;



public class GenericDAO<E> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private static EntityManager entityManager = Connection.getEntityManager();
	
	public void create(E e) {
		try {
			
			entityManager.getTransaction().begin();
		
			entityManager.persist(e);
			
			entityManager.getTransaction().commit();
			entityManager.close();
			
		} catch (Exception e2) {
			entityManager.getTransaction().rollback();
			e2.printStackTrace();
		}
	}

}
