package FactoryMethod;

public class PizzariaBaiana extends Pizzaria {

	@Override
	public Pizza criarPizza(String tipo) {
		Pizza pizza = null;
		
		if(tipo.equals("Mussarela")) {
			pizza = new PizzaMussarelaBaiana();
		} else if (tipo.equals("Calabresa")) {
			pizza = new PizzaCalabresaBaiana();
		} else if (tipo.equals("Pepperoni")) {
			pizza = new PizzaPeperoniBaiana();
		}
		
		return pizza;
	}

	@Override
	public Pizza criarPizza(Sabores sabor) {
		Pizza pizza = null;
		
		if (sabor.equals("Mussarela")){
			pizza = new PizzaMussarelaBaiana();
		} else if (sabor.equals("Pepreroni")) {
			pizza = new PizzaPeperoniBaiana();
		} else if (sabor.equals("Calabresa")) {
			pizza = new PizzaCalabresaBaiana();
		}
		
		return pizza;
	}
	
	
	
	
}
