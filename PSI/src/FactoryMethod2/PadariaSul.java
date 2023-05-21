package FactoryMethod2;

public class PadariaSul extends Padaria {

	
	public Pao criarPao(Paes tipoPao) {
		Pao pao = null;
		
		if(tipoPao.equals("Frances")) {
			pao = new PaoFrancesSul();
		} else if (tipoPao.equals("Australiano")) {
			pao = new PaoAustralianoSul();
		}
		
		
		return pao;
	}

	@Override
	public Pao criarPao(String tipoPao) {
		Pao pao = null;
		
		if(tipoPao.equals("Frances")) {
			pao = new PaoFrancesSul();
		} else if (tipoPao.equals("Australiano")) {
			pao = new PaoAustralianoSul();
		}
		
		
		return pao;
	}

}
