package br.com.queridoautomovel.controller;

import java.util.Collection;
import java.util.Date;

import javax.ejb.Remote;

import br.com.queridoautomovel.exception.PersistenceException;
import br.com.queridoautomovel.model.domain.ClienteFisica;

@Remote
public interface ClienteControllerRemote {
	
	public ClienteFisica saveOrUpdate(ClienteFisica clienteFisica) throws PersistenceException;
	public void remove(Long id) throws PersistenceException;
	
	public ClienteFisica getByid(Long id);
	public Collection<ClienteFisica> getByName(String name);
	public Collection<ClienteFisica> getByRegisterDay(Date dataCadastro);

}
