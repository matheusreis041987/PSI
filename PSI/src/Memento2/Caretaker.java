package Memento2;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	public static void main(String[] args) {
		
		Originator originator = new Originator();
		
		List<Memento> listaEstados =   new ArrayList<Memento>();

		originator.set("Matheus Reis", 36);
		listaEstados.add(originator.saveToMemento());
		originator.set("Bernardo Martins", 7);
		listaEstados.add(originator.saveToMemento());
		originator.set("Andreia Cristina de Souza", 37);
		listaEstados.add(originator.saveToMemento());
		originator.set("Aurea Maria", 63);
		listaEstados.add(originator.saveToMemento());
		
		System.out.println(listaEstados);
		
		System.out.println("==========================");
		
		
		for (int i = 0; i < listaEstados.size(); i++) {
			originator.restoreFromMemento(listaEstados.get(i));
		}
	
		
		
		
		
		
		
	}
    		
}



