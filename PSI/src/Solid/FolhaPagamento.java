package Solid;

public class FolhaPagamento {

	public static void main(String[] args) {
		Remuneracao p1 = new ContratoClt("Matheus Reis Costa", 9500.56, 950.0, 400.0, 675.0, 1965.65);
		Remuneracao e1 = new Estagio("Bernardo Martins Costa", 1200, 200); 
		
		p1.remuneracao();
		
		
		System.out.println("======================");
		System.out.println(p1.toString());
		System.out.println("======================");
		
		e1.remuneracao();
		System.out.println("======================");
		System.out.println(e1.toString());
	}

}
