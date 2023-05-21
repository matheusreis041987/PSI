package FactoryMethod;

public abstract class Pizzaria {

	//FabricaSimplesDePizza fabrica;
	
	
	/*public Pizzaria(FabricaSimplesDePizza fabrica) {
		this.fabrica = fabrica;
	}*/
	
	public final Pizza pedirPizza(String tipo) {
		
		Pizza pizza = criarPizza(tipo);
		
		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.embalar();
		
		return pizza;
	}
	
	public final Pizza pedirPizza(Sabores sabor) {
		Pizza pizza = criarPizza(sabor);
		
		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.embalar();
		
		return pizza;
	}
	
	public abstract Pizza criarPizza(String tipo);
	public abstract Pizza criarPizza(Sabores sabor);
	
}
