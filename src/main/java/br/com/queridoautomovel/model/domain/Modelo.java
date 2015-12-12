package br.com.queridoautomovel.model.domain;

import java.io.Serializable;

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
@Table(name = "modelo")
public class Modelo extends AbstractEntity implements Serializable {

	@Column(name = "descricao", length = 40)
	private String descricao;

	public Modelo() {
		// TODO Auto-generated constructor stub
	}

	public final String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
