package State2;

public class TemMoeda implements State {

	MaquinaChiclete maquina;
	
	public TemMoeda(MaquinaChiclete maquina) {
		super();
		this.maquina = maquina;
	}
	
	public void inserirMoeda() {
		System.out.println("Moeda já inserida");
		
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("Moeda será ejetada");
		maquina.setEstadoAtual(maquina.getSemMoeda());
		
	}

	@Override
	public void pressionarAlavanca() {
		System.out.println("Alavanca sendo pressionada");
		maquina.setEstadoAtual(maquina.getTemMoeda());
		
	}

	@Override
	public void ejetarChiclete() {
		System.out.println("O chiclete sairá em breve");
		maquina.setEstadoAtual(maquina.getChicleteVendido());
	}

}
