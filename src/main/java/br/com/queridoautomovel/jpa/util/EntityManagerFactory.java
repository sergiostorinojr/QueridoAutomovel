package br.com.queridoautomovel.jpa.util;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * 
 * QueridoAutomovel
 * 
 * @author Sérgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015 - 22:52:49
 *
 */
public class EntityManagerFactory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Resource resource;

	public EntityManager getEntityManager() {
		return resource.getEntityManager();
	}

}
