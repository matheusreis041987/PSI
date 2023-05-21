package Adapter;

public class TesteAdapter {

	public static void main(String[] args) {
		
		
		Portugues p1 = new FrancesAdapter(new Frances());
		
		p1.requisitar();

	}

}
