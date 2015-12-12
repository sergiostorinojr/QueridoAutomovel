package br.com.queridoautomovel.jpa.util;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * QueridoAutomovel
 * 
 * @author Sérgio Junior - sergio.storinojr@gmail.com
 * 
 */
public class Resource implements Serializable {

	private static EntityManagerFactory emFactory;

	@Produces
	public static EntityManager getEntityManager() {
		emFactory = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emFactory.createEntityManager();
		return em;
	}

}
