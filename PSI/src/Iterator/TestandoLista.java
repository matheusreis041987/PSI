package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestandoLista {

	public static void main(String[] args) {
		
		String aula1 = "Modelando a classe";
		String aula2 = "Conhecendo mais a lista";
		String aula3 = "Trabalhando em Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<String>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		for (String i: aulas) {
			System.out.println(i);
		}
		
		System.out.println("===============================");
		// usarei o iterator para varrer a lista
		
		for (Iterator iterator = aulas.iterator(); iterator.hasNext();) {
			String lista = (String) iterator.next();
			System.out.println("Lista com iterator: " + lista);
		}
		
		System.out.println("===============================");
		
		
		
	}

}
