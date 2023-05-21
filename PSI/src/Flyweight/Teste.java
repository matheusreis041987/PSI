package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		BibliotecaDigital b1 = new BibliotecaDigital();
		
		List<String> des = new ArrayList<String>();
		
		des.add("Nintendo");
		des.add("Sony");
		
		b1.adicionarJogo("Mario Kart", des, 120);
		
	
		
		List<String> des1 = new ArrayList<String>();
		
		des1.add("Sega");
		des1.add("Microsoft");
		
		b1.adicionarJogo("Mortal Combate", des1, 110);
		
		b1.listarJogos();
		
		
		int x = 3;
		int y = 0;
		
		System.out.println(x/y);
		
		
		
	}

}
