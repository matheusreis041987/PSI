package Solid;

public class ContratoClt implements Remuneracao {

	private String nome;
	private double salario;
	private double gea;
	private double ats;
	private double inss;
	private double ir;

	public ContratoClt(String nome,double salario, double gea, double ats, double inss, double ir ) {
		this.nome = nome;
		this.ats = ats;
		this.gea = gea;
		this.inss = inss;
		this.ir = ir;
		this.salario = salario;
		System.out.println("Empregado " + nome + " criado com sucesso!");
	}
	
	
	public double remuneracao() {
		
		double x;
		
		x = salario + gea + ats - inss - ir;
		System.out.println("Empregado: " + nome + "\nSalario: " + salario + "\nGea:" 
		+ gea + "\nAts: " + ats + "\nInss: " + inss + "\nIr: " + ir + "\n" + "Remuneracao: " + x);
		
		return x;
	}
	
	public String toString() {
		return "Nome do empregado: " + nome + "\n" + "Salario: " + salario + "\n";
		
	}
	

}
