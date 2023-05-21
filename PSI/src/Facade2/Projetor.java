package Facade2;

public class Projetor {

	DvdPlayer dvdplayer;
	
	
	public void on() {
		System.out.println("Ligar Projetor.");
	}
	
	public void off() {
		System.out.println("Desligar Projetor.");
	}
	
	public void modoTv() {
		System.out.println("Ativar Modo TV.");
	}
	
}
