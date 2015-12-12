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
@Table(name = "processoClienteFisica")
public class ProcessoClienteFisica extends Processo implements Serializable {

	@OneToMany(mappedBy = "processoClienteFisica", cascade=CascadeType.ALL)
	private List<ItemProcessoFisica> itemProcessoFisica;
	@OneToOne
	@JoinColumn(name = "clienteFisica_id", nullable = false, foreignKey = @ForeignKey(name = "FK_CLIENTEFISICA_ID"))
	private ClienteFisica clienteFisica;
	@OneToOne
	@JoinColumn(name = "automovelClienteFisica_id", nullable = false, foreignKey = @ForeignKey(name = "FK_AUTOMOVELCLIENTEFISICA_ID"))
	private AutomovelClienteFisica automovelClienteFisica;

	public ProcessoClienteFisica() {
		// TODO Auto-generated constructor stub
	}

	public final List<ItemProcessoFisica> getItemProcessoFisica() {
		return itemProcessoFisica;
	}

	public final ClienteFisica getClienteFisica() {
		return clienteFisica;
	}

	public final AutomovelClienteFisica getAutomovelClienteFisica() {
		return automovelClienteFisica;
	}

	public void setItemProcessoFisica(
			List<ItemProcessoFisica> itemProcessoFisica) {
		this.itemProcessoFisica = itemProcessoFisica;
	}

	public void setClienteFisica(ClienteFisica clienteFisica) {
		this.clienteFisica = clienteFisica;
	}

	public void setAutomovelClienteFisica(
			AutomovelClienteFisica automovelClienteFisica) {
		this.automovelClienteFisica = automovelClienteFisica;
	}

}
