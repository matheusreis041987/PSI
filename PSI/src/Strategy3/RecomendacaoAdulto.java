package Strategy3;

public class RecomendacaoAdulto extends EstrategiaRecomendacaoFilme {

	@Override
	public Filme strategy() {
		
		return new Filme("Filme adulto");
	}

}
