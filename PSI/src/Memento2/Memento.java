package Memento2;

public class Memento {

	private final String estado;
	 private final int estado2;
	
	public Memento(String stateToSave, int stateToSave2) {
		estado = stateToSave;
		estado2 = stateToSave2;
	}
	
	public String getSavedState() {
		return estado;
	}
	
	public int getSavedState2() {
		
		return estado2;
	}
	
	public String toString() {
		
		return "(Nome: " + this.estado + " | idade: " + this.estado2 + " anos)";
	}
	
}
