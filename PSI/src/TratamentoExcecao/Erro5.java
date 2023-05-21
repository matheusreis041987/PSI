package TratamentoExcecao;

public class Erro5 {

	private static void aumentarLetra() throws NullPointerException {
		
		String frase = null;
		String novaFrase = null;
		
		novaFrase = frase.toUpperCase();
		
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase nova: " + novaFrase);
		
				
	}
	
	public static void main(String[] args) {
		
		try {
			Erro5.aumentarLetra();
		} catch (NullPointerException n) {
			System.out.println("Ocorreu um erro de NullPointerException ao executar "
					+ "o método aumentarLetra()" + n);
		}
		
		
	}
	
}
