package Adapter2;

public class PeruAdapter implements Pato {

	Peru peru;
	
	public PeruAdapter(Peru peru) {
		this.peru = peru;
	}
	
	
	public void voar() {
		peru.voar();
		System.out.println("...Parecido com um pato");
		
	}

	@Override
	public void quackar() {
		peru.gluglu();
		
	}

}
