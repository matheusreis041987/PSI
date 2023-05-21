package StateAtividade;

public class SemTinta implements State {

	Impressora impressora;
	
	public SemTinta (Impressora impressora) {
		super();
		this.impressora = impressora;
		
	}
	
	@Override
	public void ligar() {
		System.out.println("Impressora ligada, mas sem tinta. Favor colocar tinta");
		impressora.setEstadoAtual(impressora.getSemTinta());
		
	}

	@Override
	public void desligar() {
		System.out.println("Impressora sendo desligada. Alerta: impressora sem tinta");
		impressora.setEstadoAtual(impressora.getDesligada());
	}

	@Override
	public void colocarTinta() {
		System.out.println("Tinta sendo inserida na impressora");
		impressora.setEstadoAtual(impressora.getProntaParaImprimir());
		
		
	}

	@Override
	public void inserirPapel() {
		System.out.println("Antes de inserir papel, favor colocar tinta na impressora");
		
	}

	@Override
	public void imprimir() {
		System.out.println("Antes de imprimir, favor colocar tinta na impressora");
		impressora.setEstadoAtual(impressora.getSemTinta());
		
	}

}
