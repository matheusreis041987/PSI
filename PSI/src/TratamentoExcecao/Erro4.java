package TratamentoExcecao;

public class Erro4 {

	public static void main(String[] args) {

		String frase = null;
		String novaFrase;
		
		
		try {
			novaFrase = frase.toUpperCase();
		} catch(NullPointerException e) {
			 System.out.println("O frase inicial está nula, para solucional tal o problema, foi lhe atribuito um valor default.");
					    frase = "Frase vazia";
					    novaFrase = frase.toUpperCase();
		}
		
		frase = "Meu cachorro Thor";
		novaFrase = frase.toUpperCase();
		System.out.println("Frase Antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
	}

}
