package FactoryMethod2;

public class PaoAustralianoSul extends Pao {

	public PaoAustralianoSul() {
		
		this.setTipo("Pão Australiano Gourmet");
		this.setRecheio("Nozes e Quejo Brie");
		this.ingredientes.add("farinha especial, fermanto, água, ovo, mel ");
		
		System.out.println("Iniciando processo de preparação de pao: ");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Recheio: "+ this.getRecheio() );
		System.out.println("Ingredientes: " + this.ingredientes);
		System.out.println("<====================>");
		
		
	}
	
	
	public void preparar() {
		System.out.println("Preparando Pão Australiano de Zona Sul");
		
	}

	@Override
	public void assar() {
		System.out.println("Assar pão por 45 minutos");
		
	}

	@Override
	public void vender() {
		System.out.println("Iniciar venda do Pão Australiano da Zona Sul");
		
	}

}
