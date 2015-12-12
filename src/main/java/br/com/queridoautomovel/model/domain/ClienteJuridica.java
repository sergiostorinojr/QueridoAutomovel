package br.com.queridoautomovel.model.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * QueridoAutomovel
 * 
 * @author Sérgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
@Entity
@Table(name = "clienteJuridica")
public class ClienteJuridica extends PessoaJuridica implements Serializable {

	@OneToMany(mappedBy = "clienteJuridica", cascade = CascadeType.ALL)
	private List<EnderecoClienteJuridica> enderecoClienteJuridica;
	@OneToMany(mappedBy = "clienteJuridica", cascade = CascadeType.ALL)
	private List<TelefoneClienteJuridica> telefoneClienteJuridica;

	public ClienteJuridica() {
		// TODO Auto-generated constructor stub
	}

	public final List<EnderecoClienteJuridica> getEnderecoClienteJuridica() {
		return enderecoClienteJuridica;
	}

	public final List<TelefoneClienteJuridica> getTelefoneClienteJuridica() {
		return telefoneClienteJuridica;
	}

	public void setEnderecoClienteJuridica(
			List<EnderecoClienteJuridica> enderecoClienteJuridica) {
		this.enderecoClienteJuridica = enderecoClienteJuridica;
	}

	public void setTelefoneClienteJuridica(
			List<TelefoneClienteJuridica> telefoneClienteJuridica) {
		this.telefoneClienteJuridica = telefoneClienteJuridica;
	}

}
