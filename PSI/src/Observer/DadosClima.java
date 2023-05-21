package Observer;

import java.util.ArrayList;

public class DadosClima implements Publicador {
	
	private ArrayList<Observador> observadores = new ArrayList<Observador>();
	private float temperatura;
	private float umidade;
	private float pressao;
	
		
	public void getTemperatura() {
		
	}

	public void getUmidade() {
		
	}
	
	public void getPressao() {
		
	}
	
	public void medicoesMudaram() {
		notificarObservadores();
		
	}

	@Override
	public void registrarObsercador(Observador o) {
	observadores.add(o);
		
	}

	@Override
	public void removerObservador(Observador o) {
	int i = observadores.indexOf(o);
	if (i >=0) {
		observadores.remove(i);
	}
		
	}

	@Override
	public void notificarObservadores() {
		
		for (int i=0; i<observadores.size(); i++) {
			Observador observador = (Observador) observadores.get(i);
			observador.atualizar(temperatura, umidade, pressao);
		}
		
	}

	
	public void setMedicoes(float temperatura, float umidade, float pressao) {
		this.pressao = pressao;
		this.umidade = umidade;
		this.temperatura = temperatura;
		
		medicoesMudaram();
		
	}

	
	
}
