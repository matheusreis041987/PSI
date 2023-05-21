package StateAtividade;

public class Imprimindo implements State {

	Impressora impressora;
	
	public Imprimindo(Impressora impressora) {
		super();
		this.impressora = impressora;
	}
	
	
	
	public void ligar() {
		System.out.println("Impressora já está ligada e imprimindo");
		
		
	}

	@Override
	public void desligar() {
		System.out.println("Impressora sendo desligada");
		impressora.setEstadoAtual(impressora.getDesligada());
	}

	@Override
	public void colocarTinta() {
		System.out.println("Impressora imprimindo, favor desligar para colocar tinta");
		
	}

	@Override
	public void inserirPapel() {
		System.out.println("Impressora imprimindo, papel será inserido");
		impressora.setEstadoAtual(impressora.getProntaParaImprimir());
		
	}

	@Override
	public void imprimir() {
		System.out.println("Documento sendo impresso");
		impressora.setEstadoAtual(impressora.getImprimindo());
		
	}

}
