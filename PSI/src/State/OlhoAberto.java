package State;

public class OlhoAberto implements State {

	Pessoa pessoa;
	
	public OlhoAberto(Pessoa pessoa) {
		super();
		this.pessoa = pessoa;
		
	}
	
	@Override
	public void abrir() {
		System.out.println("Erro: os olhos já estão abertos!");
		
	}

	@Override
	public void fechar() {
		pessoa.setEstadoAtual(pessoa.getOlhoFechado());
		System.out.println("Fechando os olhos...");
	}

}
