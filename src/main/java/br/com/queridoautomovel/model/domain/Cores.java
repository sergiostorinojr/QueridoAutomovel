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
@Table(name = "cores")
public class Cores extends AbstractEntity implements Serializable {

	@Column(name = "descricao", length = 40)
	private int descricao;

	public Cores() {
		// TODO Auto-generated constructor stub
	}

	public final int getDescricao() {
		return descricao;
	}

	public void setDescricao(int descricao) {
		this.descricao = descricao;
	}

}
