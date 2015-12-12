package br.com.queridoautomovel.exception;

/**
 * 
 * QueridoAutomovel
 * 
 * @author S�rgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
public class PersistenceException extends  Exception{
	
	public PersistenceException(String msg, Exception e) {
		super(msg, e);
	}
	
	public PersistenceException(String msg) {
		super(msg);
	}

}
