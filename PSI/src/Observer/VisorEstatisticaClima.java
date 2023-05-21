package Observer;

public class VisorEstatisticaClima implements ElementoDoVisor, Observador {

	float temp;
	float umidade;
	float pressao;
	public Publicador dadosClima;
	
	public VisorEstatisticaClima(Publicador dadosClima) {
		this.dadosClima =  dadosClima;
		dadosClima.registrarObsercador(this);
		
	}
	
	@Override
	public void atualizar(float temp, float umidade, float pressao) {
		this.pressao = pressao;
		this.temp = temp;
		this.umidade = umidade;
		mostrar();
		
	}

	@Override
	public void mostrar() {
		System.out.println("Condições atuais: " + temp + " graus , " + umidade + "% umidade e " + 
	pressao + " de pressão");
		
	}

	

}
