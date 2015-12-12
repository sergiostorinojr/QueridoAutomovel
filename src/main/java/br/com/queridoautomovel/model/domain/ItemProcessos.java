package br.com.queridoautomovel.model.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
public abstract class ItemProcessos extends AbstractEntity implements
		Serializable {

	@OneToOne
	@JoinColumn(name = "servico_id", nullable = false, foreignKey = @ForeignKey(name = "FK_SERVICO_ID"))
	private Servicos servico;
	@OneToOne
	@JoinColumn(name = "produto_id", nullable = false, foreignKey = @ForeignKey(name = "FK_PRODUTO_ID"))
	private Produtos produto;
	@Column(name = "valorTotal", scale = 8, precision = 2)
	private BigDecimal valorTotal;
	@Column(name = "quantidade")
	private Integer quantidade;

	public ItemProcessos() {
		// TODO Auto-generated constructor stub
	}

	public final Servicos getServico() {
		return servico;
	}

	public final Produtos getProduto() {
		return produto;
	}

	public final BigDecimal getValorTotal() {
		return valorTotal;
	}

	public final Integer getQuantidade() {
		return quantidade;
	}

	public void setServico(Servicos servico) {
		this.servico = servico;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
