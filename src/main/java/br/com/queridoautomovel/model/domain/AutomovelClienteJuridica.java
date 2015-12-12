package br.com.queridoautomovel.model.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name = "automovelClienteJuridica")
public class AutomovelClienteJuridica extends Automovel implements Serializable {

	@OneToOne
	@JoinColumn(name = "clienteJuridica_id", nullable = false, foreignKey = @ForeignKey(name = "FK_CLIENTEJURIDICA_ID"))
	private ClienteJuridica clienteJuridica;

	public AutomovelClienteJuridica() {
		// TODO Auto-generated constructor stub
	}

	public final ClienteJuridica getClienteJuridica() {
		return clienteJuridica;
	}

	public void setClienteJuridica(ClienteJuridica clienteJuridica) {
		this.clienteJuridica = clienteJuridica;
	}

}
