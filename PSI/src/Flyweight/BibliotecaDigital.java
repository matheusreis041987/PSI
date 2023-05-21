package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaDigital {

	private List<Jogo> jogosArmazenados = new ArrayList<Jogo>();

	
	public void listarJogos() {
		
		for (Jogo j: jogosArmazenados) {
			j.mostrarJogo();
		}
		
	}
	
	
	public void adicionarJogo(String titulo, List<String> desenvolvedores, int horasJogadas) {
		this.jogosArmazenados.add(new Jogo(titulo, desenvolvedores, horasJogadas));
	}
	
	public List<Jogo> getJogosArmazenados() {
		return jogosArmazenados;
	}

	public void setJogosArmazenados(List<Jogo> jogosArmazenados) {
		this.jogosArmazenados = jogosArmazenados;
	}
	
	
	
	
	
	
}
