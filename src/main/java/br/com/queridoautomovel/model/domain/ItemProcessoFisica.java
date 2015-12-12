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
@Table(name = "itemProcessoFisica")
public class ItemProcessoFisica extends ItemProcessos implements Serializable {

	@ManyToOne
	@JoinColumn(name = "processoClienteFisica_id", nullable = false, foreignKey = @ForeignKey(name = "FK_PROCESSOCLIENTEFISICA_ID"))
	private ProcessoClienteFisica processoClienteFisica;

	public ItemProcessoFisica() {
		// TODO Auto-generated constructor stub
	}

	public final ProcessoClienteFisica getProcessoClienteFisica() {
		return processoClienteFisica;
	}

	public void setProcessoClienteFisica(
			ProcessoClienteFisica processoClienteFisica) {
		this.processoClienteFisica = processoClienteFisica;
	}

}
