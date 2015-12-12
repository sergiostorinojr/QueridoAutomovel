package br.com.queridoautomovel.model.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name="empresas")
public class Empresas implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id", insertable = false, columnDefinition = "serial")
	private Long id;
	@Column(name = "nomeFantasia", length = 100)
	private String nomeFantasia;
	@Column(name = "razaoSocial", length = 100)
	private String razaoSocial;
	@Column(name = "cnpj", length = 18)
	private String cnpj;
	@Column(name = "ie", length = 15)
	private String ie;
	@Column(name = "im", length = 15)
	private String im;
	@Column(name = "email", length = 25)
	private String email;
	@OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
	private List<TelefoneEmpresa> telefoneEmpresa;
	@OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
	private List<EnderecoEmpresa> enderecoEmpresa;
	@Enumerated(EnumType.STRING)
	@Column(name = "tipSistema", length = 20)
	private Sistema tipoSistema;
	@Enumerated(EnumType.STRING)
	@Column(name = "categoria", length = 20)
	private Categoria categoria;

	public Empresas() {
		// TODO Auto-generated constructor stub
	}

	public final Long getId() {
		return id;
	}

	public final String getNomeFantasia() {
		return nomeFantasia;
	}

	public final String getRazaoSocial() {
		return razaoSocial;
	}

	public final String getCnpj() {
		return cnpj;
	}

	public final String getIe() {
		return ie;
	}

	public final String getIm() {
		return im;
	}

	public final String getEmail() {
		return email;
	}

	public final List<TelefoneEmpresa> getTelefoneEmpresa() {
		return telefoneEmpresa;
	}

	public final List<EnderecoEmpresa> getEnderecoEmpresa() {
		return enderecoEmpresa;
	}

	public final Sistema getTipoSistema() {
		return tipoSistema;
	}

	public final Categoria getCategoria() {
		return categoria;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public void setIm(String im) {
		this.im = im;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefoneEmpresa(List<TelefoneEmpresa> telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}

	public void setEnderecoEmpresa(List<EnderecoEmpresa> enderecoEmpresa) {
		this.enderecoEmpresa = enderecoEmpresa;
	}

	public void setTipoSistema(Sistema tipoSistema) {
		this.tipoSistema = tipoSistema;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresas other = (Empresas) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
