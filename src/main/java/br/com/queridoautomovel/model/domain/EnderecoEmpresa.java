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
@Table(name = "enderecoEmpresa")
public class EnderecoEmpresa extends Endereco implements Serializable {

	@ManyToOne
	@JoinColumn(name = "parceiroEmpresa_id", nullable = false, foreignKey = @ForeignKey(name = "FK_EMPRESA_ID"))
	private Empresas empresa;

	public EnderecoEmpresa() {
		// TODO Auto-generated constructor stub
	}

	public final Empresas getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresas empresa) {
		this.empresa = empresa;
	}

}
