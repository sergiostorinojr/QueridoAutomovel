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
 * @author Sérgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
@Entity
@Table(name = "itemProcessoJuridica")
public class ItemProcessoJuridica extends ItemProcessos implements Serializable {

	@ManyToOne
	@JoinColumn(name = "processoClienteJuridica_id", nullable = false, foreignKey = @ForeignKey(name = "FK_PROCESSOCLIENTEJURIDICA_ID"))
	private ProcessoClienteJuridica processoClienteJuridica;

	public ItemProcessoJuridica() {
		// TODO Auto-generated constructor stub
	}

	public final ProcessoClienteJuridica getProcessoClienteJuridica() {
		return processoClienteJuridica;
	}

	public void setProcessoClienteJuridica(
			ProcessoClienteJuridica processoClienteJuridica) {
		this.processoClienteJuridica = processoClienteJuridica;
	}

}
