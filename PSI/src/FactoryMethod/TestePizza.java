package FactoryMethod;

public class TestePizza {

	public static void main(String[] args) {
		
	Pizzaria pizzariaCarioca = new PizzariaCarioca();
	
	Pizza pizza = pizzariaCarioca.pedirPizza(Sabores.Mussarela.name());
		
		
	}

}
