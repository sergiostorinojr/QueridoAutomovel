package br.com.queridoautomovel.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "servicos")
public class Servicos extends AbstractEntity implements Serializable {

	@Column(name = "descricao", length = 100)
	private String descricao;
	@Column(name = "precUnitario", scale = 8, precision = 2)
	private BigDecimal precUnitario;

	public Servicos() {
		// TODO Auto-generated constructor stub
	}

	public final String getDescricao() {
		return descricao;
	}

	public final BigDecimal getPrecUnitario() {
		return precUnitario;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPrecUnitario(BigDecimal precUnitario) {
		this.precUnitario = precUnitario;
	}

}