package br.com.queridoautomovel.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
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
public abstract class Endereco extends AbstractEntity implements Serializable {

	@Column(name = "cep", length = 10)
	private String cep;
	@Column(name = "logradouro", length = 100)
	private String logradouro;
	@Column(name = "numero")
	private Long numero;
	@Column(name = "complemento", length = 20)
	private String complemento;
	@Column(name = "bairro", length = 40)
	private String bairro;
	@Column(name = "ibge", length = 30)
	private String ibge;
	@Column(name = "pais", length = 40)
	private String pais;
	@Enumerated(EnumType.STRING)
	@Column(name = "uf", length = 2)
	private UF uf;

	public Endereco() {
		// TODO Auto-generated constructor stub
	}

	public final String getCep() {
		return cep;
	}

	public final String getLogradouro() {
		return logradouro;
	}

	public final Long getNumero() {
		return numero;
	}

	public final String getComplemento() {
		return complemento;
	}

	public final String getBairro() {
		return bairro;
	}

	public final String getIbge() {
		return ibge;
	}

	public final String getPais() {
		return pais;
	}

	public final UF getUf() {
		return uf;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

}
