package Observer;

public class VisorCondicoesAtuais implements Observador, ElementoDoVisor {

	private float temperatura;
	private float umidade;
	private Publicador dadosClima;
	
	public VisorCondicoesAtuais (Publicador dadosClima) {
		this.dadosClima = dadosClima;
		dadosClima.registrarObsercador(this);
	}
	
	@Override
	public void mostrar() {
		System.out.println("Condições atuais: " + temperatura + " graus e " + umidade + "% umidade");
		
	}

	@Override
	public void atualizar(float temp, float umidade, float pressao) {
		this.temperatura = temp;
		this.umidade = umidade;
		mostrar();
		
	}




}
