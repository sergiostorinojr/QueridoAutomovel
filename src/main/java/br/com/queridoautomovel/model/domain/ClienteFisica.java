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
@Table(name = "clienteFisica")
public class ClienteFisica extends PessoaFisica implements Serializable {

	@OneToMany(mappedBy = "clienteFisica", cascade = CascadeType.ALL)
	private List<EnderecoClienteFisica> enderecoClienteFisica;
	@OneToMany(mappedBy = "clienteFisica", cascade = CascadeType.ALL)
	private List<TelefoneClienteFisica> telefoneClienteFisica;

	public ClienteFisica() {
		// TODO Auto-generated constructor stub
	}

	public final List<EnderecoClienteFisica> getEnderecoClienteFisica() {
		return enderecoClienteFisica;
	}

	public final List<TelefoneClienteFisica> getTelefoneClienteFisica() {
		return telefoneClienteFisica;
	}

	public void setEnderecoClienteFisica(
			List<EnderecoClienteFisica> enderecoClienteFisica) {
		this.enderecoClienteFisica = enderecoClienteFisica;
	}

	public void setTelefoneClienteFisica(
			List<TelefoneClienteFisica> telefoneClienteFisica) {
		this.telefoneClienteFisica = telefoneClienteFisica;
	}

}
