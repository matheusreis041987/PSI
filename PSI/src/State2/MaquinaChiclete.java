package State2;

public class MaquinaChiclete {

	private State maquinaVazia = new MaquinaVazia(this);
	private State temMoeda = new TemMoeda(this);
	private State semMoeda = new SemMoeda(this);
	private State chicleteVendido = new ChicleteVendido(this);
	
	private State estadoAtual = maquinaVazia;
	
	public void inserirMoeda() {
		estadoAtual.inserirMoeda();
	}
	public void ejetarMoeda() {
		estadoAtual.ejetarMoeda();
	}
	
	public void pressionarAlavanca() {
		estadoAtual.pressionarAlavanca();
	}
	
	public void ejetarChiclete() {
		estadoAtual.ejetarChiclete();
	}
	
	public State getEstadoAtual() {
		return estadoAtual;
	}
	public void setEstadoAtual(State estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	public State getMaquinaVazia() {
		return maquinaVazia;
	}
	public State getTemMoeda() {
		return temMoeda;
	}
	public State getSemMoeda() {
		return semMoeda;
	}
	public State getChicleteVendido() {
		return chicleteVendido;
	}
	
	
	
	
}
