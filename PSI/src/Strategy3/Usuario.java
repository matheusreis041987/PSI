package Strategy3;

public class Usuario {

	private int idade;
	
	private EstrategiaRecomendacaoFilme estrategia;
	
	
	public Usuario (int idade) {
		this.idade = idade;
		
		if (idade < 18) {
			this.estrategia = new RecomendacaoAdolescente();
		} else {
			this.estrategia = new RecomendacaoAdulto();
		}
	}
	
	public void executarRecomendacao() {
		Filme filme =  this.estrategia.strategy();
		System.out.println(filme.getNome());
		
	}
	
}
