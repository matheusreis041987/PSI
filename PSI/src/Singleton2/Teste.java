package Singleton2;

public class Teste {

	public static void main(String[] args) {
		//MinhaClasse m1 = new MinhaClasse(); não é possivel criar objeto pois o construtor é privado
		
		MinhaClasse x = MinhaClasse.getInstance();

		x.cpf = "12896856730";
		x.nome = "Matheus Reis Costa";
		x.idade = 35;
		
		System.out.println(x.nome);
		System.out.println(x.cpf);
		System.out.println(x.idade);
		System.out.println("=============================");
		
		MinhaClasse y = MinhaClasse.getInstance();
		
		System.out.println(y.nome);
		System.out.println(y.cpf);
		System.out.println(y.idade);
		System.out.println("=============================");
		
		y.nome = "Antonio José";
		MinhaClasse z = MinhaClasse.getInstance();
		System.out.println(z.nome);
		System.out.println(z.cpf);
		System.out.println(z.idade);
		System.out.println("=============================");
		
	}

}
