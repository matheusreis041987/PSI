package FactoryMethod2;

import java.util.ArrayList;
import java.util.List;

public abstract class Pao {

	public Paes tipoPao;
	private String tipo;
	private String recheio;
	List<String> ingredientes = new ArrayList<String>();
	
	public abstract void preparar();
	public abstract void assar();
	public abstract void vender();
	
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	
	
	
	
}
