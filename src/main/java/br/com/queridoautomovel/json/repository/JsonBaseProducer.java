package br.com.queridoautomovel.json.repository;

import java.lang.reflect.Type;
import java.util.Collection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import br.com.queridoautomovel.model.domain.AbstractEntity;
import br.com.queridoautomovel.json.repository.JsonLocal;
import br.com.queridoautomovel.json.repository.JsonRemote;

/**
 * 
 * QueridoAutomovel
 * 
 * @author Sérgio Junior - sergio.storinojr@gmail.com 
 * 08/12/2015
 *
 */
public class JsonBaseProducer<T extends AbstractEntity> implements
JsonLocal<T>, JsonRemote<T> {

	private Gson gson = new Gson();
	private GsonBuilder gsonBuilder = new GsonBuilder();
	private Class<?> clazz;

	public JsonBaseProducer(Class<?> clazz) {
		super();
		this.clazz = clazz;
	}

	@Override
	public String toJson(T obj) {
		return gson.toJson(obj);
	}

	@Override
	public String listaToJson(Collection<T> lista) {
		gson = gsonBuilder.create();
		return gson.toJson(lista);
	}

	@Override
	public Object fromJson(String obj) {
		return gson.fromJson(obj, clazz);
	}

	@Override
	public Collection<T> jsonFromList(String lista) {
		Type type = TypeToken.get(clazz).getType();
		return gson.fromJson(lista, type);
	}

	public final Class<?> getClazz() {
		return clazz;
	}

}
