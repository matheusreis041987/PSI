package Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoLista2 {

	public static void main(String[] args) {
		String aula1 = "Modelando a classe";
		String aula2 = "Conhecendo mais a lista";
		String aula3 = "Trabalhando em Cursos e Sets";
		List<String> aulas = new ArrayList<String>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println("Antes de ordenar");
		System.out.println(aulas);
		
		Collections.sort(aulas);
		// é realizado o ordenamento em ordem alfabética
		System.out.println("Depois de ordenar");
		System.out.println(aulas);
		
		
		int num1 = 3;
		int num2 = 7;
		int num3 = 1;
		int num4 = 5;
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(num1);
		numeros.add(num2);
		numeros.add(num3);
		numeros.add(num4);
		System.out.println("Lista de números não ordenada");
		
		System.out.println(numeros);
		
		Collections.sort(numeros);
		
		System.out.println("Lista de números após a ordenação");
		System.out.println(numeros);
		
		// outro tipo de método para percorrer listas
		aulas.forEach(aula -> {
		    System.out.println("Percorrendo:");
		    System.out.println("Aula: " + aula);
		});
		

		
		
	
	}

}
