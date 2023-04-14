package br.com.esig.models.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
	

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("management");
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
