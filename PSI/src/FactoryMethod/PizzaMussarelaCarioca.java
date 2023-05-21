package FactoryMethod;

public class PizzaMussarelaCarioca extends Pizza {

	public PizzaMussarelaCarioca() {
	 this.setNome("Pizza de Mussarela Carioca");
	 this.setMassa("Fina e crocante");
	 this.setMolho("Molho de tomate tradicional");
	 this.setQueijo("Queijo Mussarela");
	 this.ingredientes.add("Oregano");
	// this.setCliente(cliente);
	 
	 System.out.println("O cliente " + " pediu uma " + this.getNome() + " com massa " + this.getMassa() + 
			 ", com " + this.getMolho() + ", e " + this.getQueijo());
			 
	 
	}
	
	
	public void preparar() {
		System.out.println("Preparando a pizza de Mussarela Carioca");
		
	}

	

}
