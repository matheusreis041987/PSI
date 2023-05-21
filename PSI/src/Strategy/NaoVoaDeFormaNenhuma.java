package Strategy;

public class NaoVoaDeFormaNenhuma implements ComportamentoVoador {

	@Override
	public void voar() {
		System.out.println("Não voa de forma nenhuma");

	}

}
