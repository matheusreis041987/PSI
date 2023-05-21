package TratamentoExcecao;

public class TesteExcecao {

	public static void main(String[] args) throws SemLetraBException, ImparException {
		
		String frase = "Sou um teste!";
		int numerador = 8;
		int denominador = 5;
		
		/*if (!frase.contains("b") || !frase.contains("B")) {
			throw new SemLetraBException();
		}*/
		
		if (!((numerador % denominador) == 0)) {
			
			throw new ImparException();
		}

	}

}
