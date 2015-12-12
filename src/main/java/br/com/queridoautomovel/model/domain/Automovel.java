package br.com.queridoautomovel.model.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
public abstract class Automovel extends AbstractEntity implements Serializable {

	@Column(name = "placa", length = 8)
	private String placa;
	@Temporal(TemporalType.DATE)
	@Column(name = "anoFabicacao", length = 4)
	private Date anoFabricacao;
	@Temporal(TemporalType.DATE)
	@Column(name = "anoModelo", length = 4)
	private Date anoModelo;
	@OneToOne
	@JoinColumn(name = "cor_id", foreignKey = @ForeignKey(name = "FK_COR_ID"))
	private Cores cor;
	@Column(name = "renavam", length = 11)
	private String renavam;
	@Column(name = "chassi", length = 17)
	private String chassi;
	@Enumerated(EnumType.STRING)
	@Column(name = "combustivel", length = 10)
	private Combustivel combustivel;
	@Enumerated(EnumType.STRING)
	@Column(name = "tipoAutomovel", length = 10)
	private TipoAutomovel tipoAutomovel;
	@OneToOne
	@JoinColumn(name = "montadora_id", foreignKey = @ForeignKey(name = "FK_MONTADORA_ID"))
	private Montadora montadora;
	@OneToOne
	@JoinColumn(name = "modelo_id", foreignKey = @ForeignKey(name = "FK_MODELO_ID"))
	private Modelo modelo;

	public Automovel() {
		// TODO Auto-generated constructor stub
	}

	public final String getPlaca() {
		return placa;
	}

	public final Date getAnoFabricacao() {
		return anoFabricacao;
	}

	public final Date getAnoModelo() {
		return anoModelo;
	}

	public final Cores getCor() {
		return cor;
	}

	public final String getRenavam() {
		return renavam;
	}

	public final String getChassi() {
		return chassi;
	}

	public final Combustivel getCombustivel() {
		return combustivel;
	}

	public final TipoAutomovel getTipoAutomovel() {
		return tipoAutomovel;
	}

	public final Montadora getMontadora() {
		return montadora;
	}

	public final Modelo getModelo() {
		return modelo;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setAnoFabricacao(Date anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public void setAnoModelo(Date anoModelo) {
		this.anoModelo = anoModelo;
	}

	public void setCor(Cores cor) {
		this.cor = cor;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public void setTipoAutomovel(TipoAutomovel tipoAutomovel) {
		this.tipoAutomovel = tipoAutomovel;
	}

	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

}
