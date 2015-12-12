package br.com.queridoautomovel.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;

/**
 * 
 * QueridoAutomovel
 * 
 * @author Sérgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
@Entity
public abstract class PessoaFisica extends Pessoa implements Serializable {

	@Column(name = "cpf", length = 20)
	private String cpf;
	@Column(name = "rg", length = 20)
	private String rg;
	@Column(name = "inscMunicipal", length = 20)
	private String inscMunicipal;

	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}

	public final String getCpf() {
		return cpf;
	}

	public final String getRg() {
		return rg;
	}

	public final String getInscMunicipal() {
		return inscMunicipal;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setInscMunicipal(String inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
	}

}
