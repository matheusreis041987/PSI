package StateAtividade;

public class Impressora {

	private State desligada = new Desligada(this);
	private State semTinta = new SemTinta(this);
	private State imprimindo = new Imprimindo(this);
	private State prontaParaImprimir = new ProntaParaImprimir(this);
	private State estadoAtual = desligada;
	
	public void ligar() {
		estadoAtual.ligar();
	}
	
	public void desligar() {
		estadoAtual.desligar();
	}
	
	public void colocarTinta() {
		estadoAtual.colocarTinta();
	}
	
	public void imprimir() {
		estadoAtual.imprimir();
	}
	
	public void inserirPapel() {
		estadoAtual.inserirPapel();
	}

	public State getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(State estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

	public State getDesligada() {
		return desligada;
	}

	public State getSemTinta() {
		return semTinta;
	}

	public State getImprimindo() {
		return imprimindo;
	}

	public State getProntaParaImprimir() {
		return prontaParaImprimir;
	}
	
	
	
	
	
}
