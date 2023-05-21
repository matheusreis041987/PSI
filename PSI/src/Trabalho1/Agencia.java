package Trabalho1;

import java.util.ArrayList;

public class Agencia {

	private String endereco;
	private int cod_ag;
	private int dv_ag;
	Conta conta1;
	private ArrayList<Conta> contaclientes = new ArrayList<Conta>();
	
	// fazer construtor
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCod_ag() {
		return cod_ag;
	}
	public void setCod_ag(int cod_ag) {
		this.cod_ag = cod_ag;
	}
	public int getDv_ag() {
		return dv_ag;
	}
	public void setDv_ag(int dv_ag) {
		this.dv_ag = dv_ag;
	}
	public ArrayList<Conta> getContaclientes() {
		return contaclientes;
	}
	public void setContaclientes(ArrayList<Conta> contaclientes) {
		this.contaclientes = contaclientes;
	}
	
	
	
	
}
