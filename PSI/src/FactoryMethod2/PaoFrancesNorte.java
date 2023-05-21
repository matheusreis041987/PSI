package FactoryMethod2;

public class PaoFrancesNorte extends Pao {

	public PaoFrancesNorte() {
		this.setTipo("Pão Frances Comum");
		this.setRecheio("sem recheio");
		this.ingredientes.add("farinha, fermanto, água, ovo");
		
		System.out.println("Iniciando processo de preparação de pao: ");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Recheio: "+ this.getRecheio() );
		System.out.println("Ingredientes: " + this.ingredientes);
		System.out.println("<====================>");
		
		
	}
	
	
	
	public void preparar() {
		System.out.println("Preparando Pão Frances da Zona Norte");
		
	}

	
	public void assar() {
		System.out.println("Assar pão por 25 minutos");
		
	}


	public void vender() {
		System.out.println("Iniciar venda do Pão Frances da Zona Norte");
		
	}

}
