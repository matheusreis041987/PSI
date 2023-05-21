package Strategy2;

public class Usuario {

	int idade;
	
	
	public Usuario (int idade ) {
		
		this.idade = idade;
		classEstrategiaRecomendacaoFilme recomendacao;
		
		if (idade > 18) {
			recomendacao = new recomendacaoAdulto();
		
		} else {
			recomendacao = new recomendacaoAdolescente();
		}
		recomendacao.Filme();
		
	}
	
	public void setRecomendacaoFilme(classEstrategiaRecomendacaoFilme recomendacao) {
		
		recomendacao.Filme();
	}
	
	
	
}
