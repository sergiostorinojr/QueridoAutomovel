package br.com.queridoautomovel.exception;

import java.io.Serializable;

/**
 * 
 * QueridoAutomovel
 * 
 * @author S�rgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
public enum MessageJsf implements Serializable{
	
	GRAVADO_COM_SUCESSO("Dados Gravados com Sucesso!!!"),
	DADOS_ATUALIZADO_COM_SUCESSO("Dados Atualizado com Sucesso!!!"),
	FALHA_AO_GRAVAR_DADOS("Falha ao gravar ou atualizar Dados"),
	
    DADOS_EXCLUIDO_COM_SUCESSO("FacesMessageUtil"),
    FALHA_AO_EXCLUIR_DADOS("Falha ao Excluir Dados!!!");

	private String nome;

	private MessageJsf(String nome) {
		this.nome = nome;
	}

	public final String toString() {
		return nome;
	}
	
	

}
