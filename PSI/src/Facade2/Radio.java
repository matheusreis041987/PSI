package Facade2;

public class Radio {

	Amplificador amplificador;
	
	
	public void on() {
		System.out.println("Ligar Rádio");
	}
	
	public void off() {
		System.out.println("desligar Rádio.");
	}
	
	public int setFm(int canal) {
		System.out.println("O canal escolhido foi " + canal + ".");
		return canal;
	}
	
}
