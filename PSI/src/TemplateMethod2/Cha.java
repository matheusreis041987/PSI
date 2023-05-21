package TemplateMethod2;

public class Cha extends BebidaCafeina {

	@Override
	void misturarProduto() {
		System.out.println("Misturar chá.");
		
	}

	@Override
	void adicionarCondimentos() {
		System.out.println("Adicionar limão.");
		
	}

}
