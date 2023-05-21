package Strategy;

public class PatoVermelho extends Pato {
	
	public PatoVermelho() {
		voador = new VooNasPedras();
		quackador = new Espirrar();
	}

	@Override
	public void mostrar() {
		System.out.println("Mostrar Pato Vermelho");
		
	}

	
}
