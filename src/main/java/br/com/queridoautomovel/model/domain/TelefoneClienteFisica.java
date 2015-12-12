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
@Table(name = "telefoneClienteFisica")
public class TelefoneClienteFisica extends Telefone implements Serializable {

	@ManyToOne
	@JoinColumn(name = "clienteFisica_id", nullable = false, foreignKey = @ForeignKey(name = "FK_CLIENTEFISICA_ID"))
	private ClienteFisica clienteFisica;

	public TelefoneClienteFisica() {
		// TODO Auto-generated constructor stub
	}

	public final ClienteFisica getClienteFisica() {
		return clienteFisica;
	}

	public void setClienteFisica(ClienteFisica clienteFisica) {
		this.clienteFisica = clienteFisica;
	}

}
