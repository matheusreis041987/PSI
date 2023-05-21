package State;

public class Pessoa {

	private State olhoAberto = new OlhoAberto(this);
	private State olhoFechado = new OlhoFechado(this);
	private State estadoAtual = olhoAberto;
	
	
	public State getOlhoAberto() {
		return olhoAberto;
	}

	public State getOlhoFechado() {
		return olhoFechado;
	}

	
	
	public void abrirOlho() {
		estadoAtual.abrir();
		
	}
	
	public void fecharOlho() {
		estadoAtual.fechar();
	}

	public State getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(State estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	
}
