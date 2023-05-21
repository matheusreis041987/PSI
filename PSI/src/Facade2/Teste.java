package Facade2;

public class Teste {

	public static void main(String[] args) {
		Radio r = new Radio();
		Amplificador a = new Amplificador();
		DvdPlayer d = new DvdPlayer();
		Projetor p = new Projetor();
		Tela t = new Tela();
		Luzes l = new Luzes();
		HomeTheaterFacade hm = new HomeTheaterFacade(a, r, d, t, l, p); 

		hm.assistirFilme("Harry Potter e as relíquias da Morte - parte 1");
		System.out.println("=======================");
		hm.finalizarFilme();
		
	}

}
