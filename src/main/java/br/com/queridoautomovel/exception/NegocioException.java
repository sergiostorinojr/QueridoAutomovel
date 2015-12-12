package br.com.queridoautomovel.exception;

/**
 * 
 * QueridoAutomovel
 * 
 * @author Sérgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
public class NegocioException extends Exception {

	public NegocioException(String msg, Exception e) {
		super(msg, e);
	}
	
	public NegocioException(String msg) {
		super(msg);
	}
}
