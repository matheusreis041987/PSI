package FactoryMethod2;

public class PaoAustralianoNorte extends Pao {

	public PaoAustralianoNorte() {
		
		this.setTipo("Pão Australiano comum");
		this.setRecheio("Sem recheio");
		this.ingredientes.add("farinha , fermanto, água, ovo, mel ");
		
		System.out.println("Iniciando processo de preparação de pao: ");
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Recheio: "+ this.getRecheio() );
		System.out.println("Ingredientes: " + this.ingredientes);
		System.out.println("<====================>");
		
		
	}
	
	
	public void preparar() {
		System.out.println("Preparando Pão Australiano de Zona Norte");
		
	}

	@Override
	public void assar() {
		System.out.println("Assar pão por 40 minutos");
		
	}

	@Override
	public void vender() {
		System.out.println("Iniciar venda do Pão Australiano da Zona Norte");
		
	}

}
