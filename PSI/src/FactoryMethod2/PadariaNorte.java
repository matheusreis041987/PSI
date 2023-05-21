package FactoryMethod2;

public class PadariaNorte extends Padaria {

		
	
	public Pao criarPao(Paes tipoPao) {
		
		Pao pao = null;
		
		if (tipoPao.equals("Frances")) {
			pao = new PaoFrancesNorte();
		} else if (tipoPao.equals("Australiano")) {
			pao = new PaoAustralianoNorte();
		}
		
		return pao;
	}

	@Override
	public Pao criarPao(String tipoPao) {
Pao pao = null;
		
		if (tipoPao.equals("Frances")) {
			pao = new PaoFrancesNorte();
		} else if (tipoPao.equals("Australiano")) {
			pao = new PaoAustralianoNorte();
		}
		
		return pao;
	}

}
