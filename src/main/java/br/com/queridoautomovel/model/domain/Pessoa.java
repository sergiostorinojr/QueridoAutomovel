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
public abstract class Pessoa extends AbstractEntity implements Serializable {

	@Column(name = "nome", length = 100)
	private String nome;
	@Column(name = "sobreNome", length = 40)
	private String sobreNome;
	@Temporal(TemporalType.DATE)
	@Column(name = "dataNascimento", length = 10)
	private Date dataNascimento;
	@Temporal(TemporalType.DATE)
	@Column(name = "dataCadastro", length = 10)
	private Date dataCadastro;
	@Enumerated(EnumType.STRING)
	@Column(name = "tipoPessoa", length = 20)
	private TipoPessoa tipoPessoa;
	@Enumerated(EnumType.STRING)
	@Column(name = "situacao", length = 20)
	private Situacao situacao;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public final String getNome() {
		return nome;
	}

	public final String getSobreNome() {
		return sobreNome;
	}

	public final Date getDataNascimento() {
		return dataNascimento;
	}

	public final Date getDataCadastro() {
		return dataCadastro;
	}

	public final TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public final Situacao getSituacao() {
		return situacao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

}
