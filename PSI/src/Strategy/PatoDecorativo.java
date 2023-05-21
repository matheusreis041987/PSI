package Strategy;

public class PatoDecorativo extends Pato {
	
	public void PatoDecorativo() {
		quackador = new FicarMudo();
		voador = new NaoVoaDeFormaNenhuma();
	}

	@Override
	public void mostrar() {
		System.out.println("Mostrar Pato Decorativo");
		
	}

	
	
}
