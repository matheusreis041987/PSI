package StateAtividade;

public class Desligada implements State {

	Impressora impressora;
	
	public Desligada (Impressora impressora) {
		super();
		this.impressora = impressora;
	}
	
	
	public void ligar() {
		System.out.println("Impressora sendo ligada");
		impressora.setEstadoAtual(impressora.getProntaParaImprimir());
		
	}

	
	public void desligar() {
		System.out.println("Impressora desligada");
		impressora.setEstadoAtual(impressora.getDesligada());
		
	}

	@Override
	public void colocarTinta() {
		System.out.println("A impressora está desligada. Favor ligá-la");
		
	}

	@Override
	public void inserirPapel() {
		System.out.println("Favor ligar a impressora antes de inserir papel");
		
	}

	@Override
	public void imprimir() {
		System.out.println("Favor ligar a impressora antes de imprimir");
		
	}

	
	
}
