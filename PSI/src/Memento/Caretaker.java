package Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

	public static void main(String[] args) {
		
		Originator originator = new Originator();
		
		List<Memento> salvandoEstados = new ArrayList<Memento>();
		
		originator.set("Matheus");
		salvandoEstados.add(originator.saveToMemento());
		originator.set("Andreia");
		salvandoEstados.add(originator.saveToMemento());
		originator.set("Bernardo");
		salvandoEstados.add(originator.saveToMemento());
		originator.set("Aurea");
		salvandoEstados.add(originator.saveToMemento());
		
		originator.restoreFromMemento(salvandoEstados.get(3));
		originator.restoreFromMemento(salvandoEstados.get(2));
		originator.restoreFromMemento(salvandoEstados.get(1));
		originator.restoreFromMemento(salvandoEstados.get(0));
		
		System.out.println(salvandoEstados);
		
	}

}
