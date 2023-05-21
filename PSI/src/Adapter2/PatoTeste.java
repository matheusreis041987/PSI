package Adapter2;

public class PatoTeste {

	public static void main(String[] args) {
		
		Pato pato = new PatoMalhado();
		Peru peru = new PeruSelvagem();
		Pato peruAdapter = new PeruAdapter(peru);
		
		pato.voar();
		pato.quackar();
		System.out.println("===========================================");
		peru.gluglu();
		peru.voar();
		System.out.println("===========================================");
		peruAdapter.voar();
		peruAdapter.quackar();
	}

}
