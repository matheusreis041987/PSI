package StateAtividade;

public class ProntaParaImprimir implements State {

	Impressora impressora;
	
	public ProntaParaImprimir(Impressora impressora) {
		super();
		this.impressora = impressora;
	}
	
	
	public void ligar() {
		System.out.println("Impressora ligada e pronta para imprimir");
		impressora.setEstadoAtual(impressora.getProntaParaImprimir());
		
	}

	@Override
	public void desligar() {
		System.out.println("Impressora sendo desligada");
		impressora.setEstadoAtual(impressora.getDesligada());
		
	}

	@Override
	public void colocarTinta() {
		System.out.println("tinta sendo colocada na impressora");
		impressora.setEstadoAtual(impressora.getProntaParaImprimir());
	}

	@Override
	public void inserirPapel() {
		System.out.println("Papel sendo colocado na impressora");
		impressora.setEstadoAtual(impressora.getProntaParaImprimir());
	}

	@Override
	public void imprimir() {
		System.out.println("Documento sendo impresso");
		impressora.setEstadoAtual(impressora.getImprimindo());
	}

}
