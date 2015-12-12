package br.com.queridoautomovel.controller;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.ejb.Stateless;

import br.com.queridoautomovel.exception.PersistenceException;
import br.com.queridoautomovel.jpa.repository.BaseRepository;
import br.com.queridoautomovel.model.domain.ClienteFisica;

@Stateless
public class ControllerCliente implements Serializable, ClienteControllerLocal, ClienteControllerRemote {

	@Override
	public ClienteFisica getByid(Long id) {
		return new BaseRepository<ClienteFisica>(ClienteFisica.class).findById(id);
	}

	@Override
	public Collection<ClienteFisica> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ClienteFisica> getByRegisterDay(Date dataCadastro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteFisica saveOrUpdate(ClienteFisica clienteFisica) throws PersistenceException {
		return new BaseRepository<ClienteFisica>(ClienteFisica.class).saveOrUpdate(clienteFisica);
	}

	@Override
	public void remove(Long id) throws PersistenceException {
		new BaseRepository<ClienteFisica>(ClienteFisica.class).toRemove(id);
	}
	

	
}
