package Adapter;

public class FrancesAdapter implements Portugues {

	Frances frances;
	
	public FrancesAdapter(Frances frances) {
		this.frances = frances;
	}
	
	public void requisitar() {
		
		frances.commande();
	}

}
