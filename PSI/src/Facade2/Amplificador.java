package Facade2;

public class Amplificador {

	Radio radio;
	DvdPlayer dvdPlayer;
	
	
	public void on() {
		System.out.println("Ligar Amplificador.");
	}
	
	public void off() {
		System.out.println("Desligar Amplificador.");
	}
	
	public int setVColume (int volume) {
	
		System.out.println("O volume está em " + volume + ".");
		return volume;
		
	}
	
}
