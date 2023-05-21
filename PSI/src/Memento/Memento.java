package Memento;

public class  Memento {

	private final String estado;

	public String getEstadoSalvo() {
		return estado;
	}
	
	public Memento(String estadoSalvo) {
		estado = estadoSalvo;
	}
	
public String toString () {
		
	return "(Estado: " + this.estado + ")";
		
	}
	
}
