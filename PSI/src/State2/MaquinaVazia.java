package State2;

public class MaquinaVazia implements State {

	MaquinaChiclete maquina;
	
	public MaquinaVazia(MaquinaChiclete maquina) {
		super();
		this.maquina = maquina;
	}
	
	public void inserirMoeda() {
		System.out.println("Moeda sendo inserida");
		maquina.setEstadoAtual(maquina.getTemMoeda());
		
	}

	
	public void ejetarMoeda() {
		System.out.println("Não há moedas pois a máquina está vazia");
		
	}

	
	public void pressionarAlavanca() {
		System.out.println("Para pressionar a alavanva, deve-se inserir uma moeda");
		
	}

	@Override
	public void ejetarChiclete() {
		System.out.println("Para comprar um chiclete, insira uma moeda");
		
	}

}
