package br.com.queridoautomovel.json.repository;

import java.util.Collection;

import javax.ejb.Local;

import br.com.queridoautomovel.model.domain.AbstractEntity;

/**
 * 
 * QueridoAutomovel
 * 
 * @author Sérgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
@Local
public interface JsonLocal<T extends AbstractEntity> {
	
	public String toJson(T obj);
	public String listaToJson(Collection<T> lista);
	public Object fromJson(String obj);
	public Collection<T> jsonFromList(String lista);

}
