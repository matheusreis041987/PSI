package State2;

public class ChicleteVendido implements State {

	MaquinaChiclete maquina;
	
	public ChicleteVendido(MaquinaChiclete maquina) {
		super();
		this.maquina = maquina;
		
	}
	
	
	public void inserirMoeda() {
		System.out.println("Moeda sendo inserida");
		maquina.setEstadoAtual(maquina.getTemMoeda());
	}

	@Override
	public void ejetarMoeda() {
		System.out.println("Moeda há moedas na máquina");
		maquina.setEstadoAtual(maquina.getSemMoeda());
	}

	@Override
	public void pressionarAlavanca() {
		System.out.println("Para comprar outro chiclete, insira uma moeda");
		
	}

	@Override
	public void ejetarChiclete() {
		System.out.println("Chiclete vendido. Para comprar outro chiclete, insira mais uma moeda");
		
	}

}
