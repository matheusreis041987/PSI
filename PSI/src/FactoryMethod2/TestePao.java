package FactoryMethod2;

public class TestePao {

	public static void main(String[] args) {
		Padaria pNorte = new PadariaNorte();
		Padaria pSul = new PadariaSul();
		
		pNorte.pedirPao(Paes.Australiano.name());
		
		System.out.println("==================================");
		
		pSul.pedirPao(Paes.Australiano.name());

	}

}
