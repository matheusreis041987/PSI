package Iterator;

public class Aula {

	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.tempo = tempo;
		this.titulo = titulo;
	}
	
	// reescrevendo o método toString
	
	public String toString(){
		
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	
	
}
