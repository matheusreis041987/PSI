package Flyweight;

import java.util.List;

public class Jogo {

	private int horasJogadas;
	
	private JogoFlyweight jogoFlyweight;
	
	
	public Jogo (String titulo, List<String> desenvolvedores, int horasJogadas ) {
		
		jogoFlyweight = new JogoFlyweight(titulo, desenvolvedores);
		this.setHorasJogadas(horasJogadas);
	}
	
	public void mostrarJogo() {
		
		System.out.println("Título do jogo: " + this.jogoFlyweight.getTitulo() + "\ndesenvolvedores: "
				+ this.jogoFlyweight.getDesenvolvedores() + "\nhoras Jogadas: " + this.horasJogadas + "\n");
		
	}

	public int getHorasJogadas() {
		return horasJogadas;
	}

	public void setHorasJogadas(int horasJogadas) {
		this.horasJogadas = horasJogadas;
	}

	public JogoFlyweight getJogoFlyweight() {
		return jogoFlyweight;
	}

	public void setJogoFlyweight(JogoFlyweight jogoFlyweight) {
		this.jogoFlyweight = jogoFlyweight;
	}
	
	
	
	
	
}
