package br.com.queridoautomovel.jpa.repository;

import java.util.Collection;

import javax.ejb.Remote;

import br.com.queridoautomovel.exception.PersistenceException;

/**
 * 
 * QueridoAutomovel
 * 
 * @author Sérgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
@Remote
public interface BaseRepositoryRemote<T> {
	
	public T saveOrUpdate(T obj) throws PersistenceException;

	public void toRemove(Long id) throws PersistenceException;

	public Collection<T> findAll();

	public T findById(Long id) ;


}
