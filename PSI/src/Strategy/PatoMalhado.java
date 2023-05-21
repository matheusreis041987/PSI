package Strategy;

public class PatoMalhado extends Pato {
	
	public PatoMalhado() {
		quackador = new QuackarAgudo();
		voador = new VoarComAsas();
	}

	@Override
	public void mostrar() {
		System.out.println("Mostrar Pato Malhado");
		
	}

}
