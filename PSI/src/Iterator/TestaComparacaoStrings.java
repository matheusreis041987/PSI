package Iterator;

public class TestaComparacaoStrings {

	public static void main(String[] args) {
		
		String s1 = "paulo";
		String s2 = "matheus";
		String s3 = "Matheus";
		String s4 = "matheus";
		int resultado = s2.compareTo(s4);
		
		System.out.println(resultado);

		/*O resultado da comparação é um int, pois um boolean não bastaria. Esse método devolve 
		 * um número negativo se s1 é menor que s2, um número positivo se s2 é menor que s1 e 0 se forem iguais. 
		 * Mas o que é maior, menor e igual? No caso da String, quem implementou a classe decidiu que o critério 
		 * de comparação seria a ordem lexicográfica (alfabética, por assim dizer)
		 */
		
	}

}
