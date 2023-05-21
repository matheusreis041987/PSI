package Solid;

public class Estagio implements Remuneracao {

	
	private String nome;
	private double ajudaCusto;
	private double alimentacao;

	public Estagio(String nome, double ajudaCusto, double alimentacao) {
		this.ajudaCusto = ajudaCusto;
		this.alimentacao = alimentacao;
		this.nome = nome;
		System.out.println("Estagiário " + nome + " criado com sucesso!");
	}
	
	public double remuneracao() {

		double y;
		
		y = ajudaCusto + alimentacao;
		System.out.println("Estagiário: " + nome + "\nAjuda de Custo: " + ajudaCusto +
				"\nAlimentacao: " + alimentacao + "\n" + "Remuneracao: " + y);
		return y;
	}

	public String toString() {
		return "Estagiário: " + nome + "\nAjuda de Custo :" + ajudaCusto;
	}
}
