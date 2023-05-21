package Trabalho2;

import java.util.ArrayList;

public class Empresa {
	
	private String nome;
	private String cnpj;
	private double capitalSocial;
	private Pessoa empregado;
	public ArrayList<Pessoa> empregados = new ArrayList<Pessoa>();
	
	
	public Empresa (String nome, String cnpj, double capitalSocial) {
		
		this.capitalSocial = capitalSocial;
		this.cnpj = cnpj;
		this.nome = nome;
		
	}
	
	
	public Pessoa addFuncionarios (Pessoa empregado) {
		
		empregados.add(empregado);
		
		System.out.println("Funcionário " + empregado.getNome() + " foi adicionado com sucesso "
				+ "à Empresa " + nome);
		
		return empregado;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public double getCapitalSocial() {
		return capitalSocial;
	}


	public void setCapitalSocial(double capitalSocial) {
		this.capitalSocial = capitalSocial;
	}


	public Pessoa getEmpregado() {
		return empregado;
	}


	public void setEmpregado(Pessoa empregado) {
		this.empregado = empregado;
	}


	public ArrayList<Pessoa> getEmpregados() {
		return empregados;
	}


	public void setEmpregados(ArrayList<Pessoa> empregados) {
		this.empregados = empregados;
	}
	
	public void folhaPagamento() {
		System.out.println("> ========== FOLHA DE PAGAMENTO DA EMPRESA " + nome + " ========== <");
		System.out.println(" ");
		System.out.println(" ");
		for (Pessoa p: empregados) {
			p.calcularPagamento(p);
			System.out.println(" ");
			System.out.println(" ");
		}
		
		System.out.println("> ========================================================== <");
	}

}
