package FactoryMethod2;

public class PaoFrancesSul extends Pao {

	
	public PaoFrancesSul() {
		this.setTipo("Pão Frances Gourmet");
		this.setRecheio("Damasco e bacon");
		this.ingredientes.add("Damasco, bacon, farinha, fermanto, água, ovo");
		
		System.out.println("Iniciando processo de preparação de pao: ");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Recheio: "+ this.getRecheio() );
		System.out.println("Ingredientes: " + this.ingredientes);
		System.out.println("<====================>");
	}
	
	@Override
	public void preparar() {
		System.out.println("Preparando Pão Frances de Zonal Sul");
		
	}

	@Override
	public void assar() {
		System.out.println("Assar pão por 35 minutos");
		
	}

	@Override
	public void vender() {
		System.out.println("Iniciar venda do Pão Frances de Zonal Sul");
		
	}

	
	
	
}
