package br.com.queridoautomovel.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 
 * QueridoAutomovel
 * 
 * @author Sérgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
@Entity
public abstract class PessoaJuridica extends Pessoa implements Serializable {

	@Column(name = "cnpj", length = 20)
	private String cnpj;
	@Column(name = "inscEstadual", length = 20)
	private String inscEstadual;
	@Column(name = "nomeFantasia", length = 100)
	private String nomeFantasia;

	public PessoaJuridica() {
		// TODO Auto-generated constructor stub
	}

	public final String getCnpj() {
		return cnpj;
	}

	public final String getInscEstadual() {
		return inscEstadual;
	}

	public final String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

}
