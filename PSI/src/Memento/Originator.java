package Memento;

public class Originator {

	private String estado;
	
	
	public void set (String estado) {
		System.out.println("Originator: Setando o estado para: " +estado);
		this.estado = estado;
	}
	
	
	public Memento saveToMemento() {
		
		System.out.println("Originator: Salvando no Memento");
		return new Memento(estado);
	}
	
	public void restoreFromMemento(Memento memento) {
		estado = memento.getEstadoSalvo();
		System.out.println("Originator: Estado após a restauração do Memento: " + estado);
		
	}
	

}
