package State2;

public class TesteMaquinaChiclete {

	public static void main(String[] args) {
		
		MaquinaChiclete m1 = new MaquinaChiclete();
		
		m1.inserirMoeda();
		m1.inserirMoeda();
		m1.inserirMoeda();
		m1.pressionarAlavanca();
		m1.ejetarChiclete();
		m1.inserirMoeda();
		m1.ejetarMoeda();
		m1.inserirMoeda();
		m1.inserirMoeda();
	}

}
