package State;

public class OlhoFechado implements State {

	Pessoa pessoa;
	
	public OlhoFechado(Pessoa pessoa) {
		super();
		this.pessoa = pessoa;
	}
	
	@Override
	public void abrir() {
		pessoa.setEstadoAtual(pessoa.getOlhoAberto());
		System.out.println("Abrindo os olhos...");
		
	}

	@Override
	public void fechar() {
		System.out.println("Erro: os olhos já estão fechados!");
		
	}

}
