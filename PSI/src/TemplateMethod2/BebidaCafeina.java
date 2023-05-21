package TemplateMethod2;

public abstract class BebidaCafeina {
	
	public final void prepararReceita() {
		ferverAgua();
		misturarProduto();
		colocarNaXicara();
		adicionarCondimentos();
		gancho();
	}
	
	
	abstract void misturarProduto();
	abstract void adicionarCondimentos();
	
	public void ferverAgua() {
		System.out.println("Ferver a água.");
	}
	
	public void colocarNaXicara() {
		System.out.println("Colocar na xícara.");
	}
	
	void gancho() {};

}
