package br.com.queridoautomovel.service.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 * 
 * QueridoAutomovel
 * 
 * @author Sérgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
public class QueridoAutomovelApplication extends Application {
	
	public QueridoAutomovelApplication() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		 HashSet<Class<?>> clazz = new HashSet<Class<?>>();
		
		return clazz;
	}

}
