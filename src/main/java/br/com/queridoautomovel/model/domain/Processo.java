package br.com.queridoautomovel.model.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
public abstract class Processo extends AbstractEntity implements Serializable {

	@Temporal(TemporalType.DATE)
	@Column(name = "dataEmissao", length = 10)
	private Date dataEmissao;
	@Temporal(TemporalType.DATE)
	@Column(name = "dataFinalizacao", length = 10)
	private Date dataFinalizacao;
	@Column(name = "tempoServico")
	private Long tempoServico;
	@Column(name = "condPagamento", length = 30)
	private String condPagamento;
	@Column(name = "vendedorResponavel", length = 100)
	private String vendedorResponsavel;
	@Column(name = "tecnicoResponavel", length = 100)
	private String tecnicoResponsavel;
	@Enumerated(EnumType.STRING)
	@Column(name = "statusProcesso", length = 25)
	private StatusProcesso statusProcesso;

	public Processo() {
		// TODO Auto-generated constructor stub
	}

	public final Date getDataEmissao() {
		return dataEmissao;
	}

	public final Date getDataFinalizacao() {
		return dataFinalizacao;
	}

	public final Long getTempoServico() {
		return tempoServico;
	}

	public final String getCondPagamento() {
		return condPagamento;
	}

	public final String getVendedorResponsavel() {
		return vendedorResponsavel;
	}

	public final String getTecnicoResponsavel() {
		return tecnicoResponsavel;
	}

	public final StatusProcesso getStatusProcesso() {
		return statusProcesso;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public void setDataFinalizacao(Date dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

	public void setTempoServico(Long tempoServico) {
		this.tempoServico = tempoServico;
	}

	public void setCondPagamento(String condPagamento) {
		this.condPagamento = condPagamento;
	}

	public void setVendedorResponsavel(String vendedorResponsavel) {
		this.vendedorResponsavel = vendedorResponsavel;
	}

	public void setTecnicoResponsavel(String tecnicoResponsavel) {
		this.tecnicoResponsavel = tecnicoResponsavel;
	}

	public void setStatusProcesso(StatusProcesso statusProcesso) {
		this.statusProcesso = statusProcesso;
	}

}
