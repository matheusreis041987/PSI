package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TesteListaAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Matemática", 120);
		Aula a2 = new Aula("Português", 110);
		Aula a3 = new Aula("Física", 140);
		
		
		List<Aula> aulas = new ArrayList<Aula>();

		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		for (Aula i: aulas) {
			System.out.println("Título: " + i.getTitulo() + "; Tempo: " + i.getTempo() + " minutos");
			
		}
		
		
		
		
	}

}
