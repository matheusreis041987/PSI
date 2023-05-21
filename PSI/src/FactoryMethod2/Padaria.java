package FactoryMethod2;

public abstract class Padaria {
	
	public abstract Pao criarPao(Paes tipoPao);
	public abstract Pao criarPao(String tipoPao);

	public final Pao pedirPao(Paes tipoPao) {
		
		Pao pao =  criarPao(tipoPao);
		
		pao.preparar();
		pao.assar();
		pao.vender();
		
		return pao;		
		
		
	}
	
	public final Pao pedirPao(String tipoPao) {
		
		Pao pao =  criarPao(tipoPao);
		
		pao.preparar();
		pao.assar();
		pao.vender();
		
		return pao;		
		
		
	}
	
}
