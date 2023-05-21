package State2;

public class SemMoeda implements State {

	MaquinaChiclete maquina;
	
	
	public SemMoeda(MaquinaChiclete maquina) {
		super();
		this.maquina = maquina;
	}
	
	public void inserirMoeda() {
		System.out.println("Moeda inserida");
		maquina.setEstadoAtual(maquina.getTemMoeda());
		
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("Você ainda não inseriu a moeda");
		maquina.setEstadoAtual(maquina.getSemMoeda());
	}

	@Override
	public void pressionarAlavanca() {
		System.out.println("Alavanca presionada, mas nenhuma moeda inserida");
		
	}

	@Override
	public void ejetarChiclete() {
		System.out.println("Você deve pagar primeiro");
		
	}

}
