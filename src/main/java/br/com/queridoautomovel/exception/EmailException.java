package br.com.queridoautomovel.exception;

/**
 * 
 * QueridoAutomovel
 * 
 * @author Sérgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
public class EmailException extends Exception {

	public EmailException(String msg, Exception e) {
		super(msg, e);
	}

	public EmailException(String msg) {
		super(msg);
	}

}
