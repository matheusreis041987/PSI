package Flyweight;

import java.util.List;

public class JogoFlyweight {

	private String titulo;
	
	private List<String> desenvolvedores;
	
	
	public JogoFlyweight(String titulo,List<String> desenvolvedores ) {
		this.setTitulo(titulo);
		this.setDesenvolvedores(desenvolvedores);
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getDesenvolvedores() {
		return desenvolvedores;
	}

	public void setDesenvolvedores(List<String> desenvolvedores) {
		this.desenvolvedores = desenvolvedores;
	}
	
	
	
	
	
}
