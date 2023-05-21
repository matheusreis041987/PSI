package FactoryMethod;

public enum Sabores {

	Calabresa("Calabresa"), Mussarela("Mussarela"), Pepperoni("Pepreroni");

	private final String sabores;
	
	Sabores(String sabores) {
		
		this.sabores = sabores;
		
	}
	
	public String getSabores() {
		return sabores;
	}
	
	
}
