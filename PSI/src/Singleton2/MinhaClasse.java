package Singleton2;

public class MinhaClasse {
	
	
	String nome;
	String cpf;
	int idade;
	private static MinhaClasse unicaInstancia;
	
	
	private MinhaClasse() {}
	
	public static MinhaClasse getInstance() {
		
		if (unicaInstancia == null) {
			unicaInstancia = new MinhaClasse();
		}
				
		return unicaInstancia;
	}
		
	
	
	

}
