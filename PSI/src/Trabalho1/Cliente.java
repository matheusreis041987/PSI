package Trabalho1;

import java.util.ArrayList;
import java.util.Objects;

public class Cliente {

	private String nome;
	private String cpf;
    private Agencia agencia;
	//private Agencia[] agencia1 = new Agencia[1];
	private ArrayList<Conta> conta = new ArrayList<Conta>();
	public static int quantidadeClientes = 0;
	
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public ArrayList<Conta> getConta() {
		return conta;
	}
	public void setConta(ArrayList<Conta> conta) {
		this.conta = conta;
	} 
	
	public Cliente (String nome, String cpf, Agencia agencia, Conta conta1 ) {
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = agencia;
		this.conta.add(conta1);
		Cliente.quantidadeClientes++;
		
		
	}

	public int hashCode() {
		return Objects.hash(agencia, conta, cpf, nome);
	}
	
	public boolean equals(String nome, String cpf) {
		
		if (this.cpf == cpf && this.nome == nome) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
}
