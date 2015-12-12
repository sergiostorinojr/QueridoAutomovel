package br.com.queridoautomovel.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.Entity;
import javax.persistence.InheritanceType;

/**
 * 
 * QueridoAutomovel
 * 
 * @author Sérgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Telefone extends AbstractEntity implements Serializable {

	@Column(name = "contato", length = 80)
	private String contato;
	@Enumerated(EnumType.STRING)
	@Column(name = "operadora", length = 20)
	private Operadora operadora;
	@Enumerated(EnumType.STRING)
	@Column(name = "tipoTelefone", length = 20)
	private TipoTelefone tipoTelefone;
	@Enumerated(EnumType.STRING)
	@Column(name = "tipoContatoTelefone", length = 20)
	private TipoContatoTelefone tipoContatoTelefone;

	public Telefone() {
		// TODO Auto-generated constructor stub
	}

	public final String getContato() {
		return contato;
	}

	public final Operadora getOperadora() {
		return operadora;
	}

	public final TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public final TipoContatoTelefone getTipoContatoTelefone() {
		return tipoContatoTelefone;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public void setTipoContatoTelefone(TipoContatoTelefone tipoContatoTelefone) {
		this.tipoContatoTelefone = tipoContatoTelefone;
	}

}
