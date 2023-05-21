package Memento2;

public class Originator {

	private String nome;
	private int idade;
	
	public void set (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
		System.out.println("Setando o estado para: " + nome + " | " + idade +" anos");
		
		
	}
	
	public Memento saveToMemento() {
		System.out.println("Salvando no Memento");
		return new Memento(nome, idade);
		
		}
	
	public void restoreFromMemento (Memento memento) {
		nome = memento.getSavedState();
		idade = memento.getSavedState2();
		
		System.out.println("Estado após a restauração do Memento: " + nome + " | " + idade +" anos");
	}
}
