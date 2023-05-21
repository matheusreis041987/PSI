package Strategy;

public abstract class Pato {
	
	ComportamentoVoador voador;
	ComportamentoQuackador quackador;
	
	
	public void executarQuack() {
		
		quackador.quackar();
		
	}
	
	public void executarVoo() {
		
		voador.voar();
	}
	
	public void nadar() {
		System.out.println("Pato nadando.");
	}
	
	public abstract void mostrar();
	
	public void setComportamentoVoador(ComportamentoVoador cv) {
		voador = cv;
	}
	
	public void setComportamentoQuackador(ComportamentoQuackador cq) {
		quackador = cq;
	}

}
