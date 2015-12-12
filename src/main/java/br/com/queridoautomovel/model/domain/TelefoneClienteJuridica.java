package br.com.queridoautomovel.model.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * QueridoAutomovel
 * 
 * @author S�rgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
@Entity
@Table(name = "telefoneClienteJuridica")
public class TelefoneClienteJuridica extends Telefone implements Serializable {

	@ManyToOne
	@JoinColumn(name = "clienteJuridica_id", nullable = false, foreignKey = @ForeignKey(name = "FK_CLIENTEJURIDICA_ID"))
	private ClienteJuridica clienteJuridica;

	public TelefoneClienteJuridica() {
		// TODO Auto-generated constructor stub
	}

	public final ClienteJuridica getClienteJuridica() {
		return clienteJuridica;
	}

	public void setClienteJuridica(ClienteJuridica clienteJuridica) {
		this.clienteJuridica = clienteJuridica;
	}

}
