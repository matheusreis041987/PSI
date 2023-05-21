package Facade2;

public class HomeTheaterFacade {

	Amplificador amplificador;
	Radio radio;
	DvdPlayer dvdPlayer;
	Tela tela;
	Luzes luzes;
	Projetor projetor;
	boolean criarObjetos = true;
	
	
	public HomeTheaterFacade(Amplificador amplificador, Radio radio, 
			DvdPlayer dvdPlayer, Tela tela, Luzes luzes, Projetor projetor) {
		
		this.amplificador = amplificador;
		this.dvdPlayer = dvdPlayer;
		this.luzes = luzes;
		this.projetor = projetor;
		this.radio = radio;
		this.tela = tela;
	}
	
	
	
	public void assistirFilme(String filme) {
		
		System.out.println("O filme " + filme + " será iniciado agora.");
		
		amplificador.on();
		radio.on();
		radio.setFm(10);
		tela.descer();
		luzes.on();
		projetor.on();
		projetor.modoTv();
		dvdPlayer.on();
			
		
	}
	
	
	public void finalizarFilme() {
		amplificador.off();
		radio.off();
		tela.subir();
		luzes.off();
		projetor.off();
		dvdPlayer.off();
	}
	
	
}
