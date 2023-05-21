package FactoryMethod;

public class PizzariaCarioca extends Pizzaria {

	

	
	@Override
	public Pizza criarPizza(String tipo) {
		Pizza pizza = null;
		
		if(tipo.equals("Mussarela")) {
			pizza = new PizzaMussarelaCarioca();
		} else if (tipo.equals("Calabresa")) {
			pizza = new PizzaCalabresaCarioca();
		} else if (tipo.equals("Pepperoni")) {
			pizza = new PizzaPeperoniCarioca();
		}
		
		return pizza;
	
	}

	@Override
	public Pizza criarPizza(Sabores sabor) {
		Pizza pizza = null;
		
		if (sabor.equals("Mussarela")){
			pizza = new PizzaMussarelaCarioca();
		} else if (sabor.equals("Pepreroni")) {
			pizza = new PizzaPeperoniCarioca();
		} else if (sabor.equals("Calabresa")) {
			pizza = new PizzaCalabresaCarioca();
		}
		
		return pizza;
	}

}
