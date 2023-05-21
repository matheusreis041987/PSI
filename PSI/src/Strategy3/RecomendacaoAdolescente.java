package Strategy3;

public class RecomendacaoAdolescente extends EstrategiaRecomendacaoFilme {

	@Override
	public Filme strategy() {
		
		return new Filme("Filme Adolescente");
	}

	
	
}
