package Facade2;

public class DvdPlayer {

	Amplificador amplificador;
	
	public void on() {
		System.out.println("Ligar DVD.");
	}
	
	public void off() {
		System.out.println("Desligar DVD.");
	}
	
	public void pause() {
		
		System.out.println("Pausar DVD.");
	}
	
}
