package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class  Pizza {
	private String cliente;
	private String nome;
	private Sabores sabor;
	private String Massa;
	private String molho;
	private String queijo;
	
	List ingredientes = new ArrayList();
	
	
	public void preparar() {
		System.out.println("Preparando piazza de " + sabor.name());
	}
	
	public void assar() {
		System.out.println("Assando a pizza por 25 minutos");
	}
	public void cortar() {
		System.out.println("Cortando a pizza");
	}
	public void embalar() {
		System.out.println("Embalando a pizza");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sabores getSabor() {
		return sabor;
	}

	public void setSabor(Sabores sabor) {
		this.sabor = sabor;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getQueijo() {
		return queijo;
	}

	public void setQueijo(String queijo) {
		this.queijo = queijo;
	}

	public String getMassa() {
		return Massa;
	}

	public void setMassa(String massa) {
		Massa = massa;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	
}
