package br.com.queridoautomovel.model.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name = "processoClienteJuridica")
public class ProcessoClienteJuridica extends Processo implements Serializable {

	@OneToMany(mappedBy = "processoClienteJuridica", cascade = CascadeType.ALL)
	private List<ItemProcessoJuridica> itemProcessoJuridica;
	@OneToOne
	@JoinColumn(name = "automovelClienteJuridica_id", nullable = false, foreignKey = @ForeignKey(name = "FK_AUTOMOVELCLIENTEJURIDICA_ID"))
	private AutomovelClienteJuridica automovelClienteJuridica;
	@OneToOne
	@JoinColumn(name = "clienteJuridica_id", nullable = false, foreignKey = @ForeignKey(name = "FK_CLIENTEJURIDICA_ID"))
	private ClienteJuridica clienteJuridica;

	public ProcessoClienteJuridica() {
		// TODO Auto-generated constructor stub
	}

	public final List<ItemProcessoJuridica> getItemProcessoJuridica() {
		return itemProcessoJuridica;
	}

	public final AutomovelClienteJuridica getAutomovelClienteJuridica() {
		return automovelClienteJuridica;
	}

	public final ClienteJuridica getClienteJuridica() {
		return clienteJuridica;
	}

	public void setItemProcessoJuridica(
			List<ItemProcessoJuridica> itemProcessoJuridica) {
		this.itemProcessoJuridica = itemProcessoJuridica;
	}

	public void setAutomovelClienteJuridica(
			AutomovelClienteJuridica automovelClienteJuridica) {
		this.automovelClienteJuridica = automovelClienteJuridica;
	}

	public void setClienteJuridica(ClienteJuridica clienteJuridica) {
		this.clienteJuridica = clienteJuridica;
	}

}
