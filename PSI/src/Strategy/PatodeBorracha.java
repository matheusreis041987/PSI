package Strategy;

public class PatodeBorracha extends Pato {

	public void patoDeBorracha() {
		
		quackador = new FicarMudo();
		voador = new NaoVoaDeFormaNenhuma();
	}
	
	
	@Override
	public void mostrar() {
		System.out.println("Mostrar Pato de Borracha");
		
	}

	
}
