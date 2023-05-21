package Adapter2;

public class PatoMalhado implements Pato {

	@Override
	public void voar() {
		System.out.println("Estopu voando!");
		
	}

	@Override
	public void quackar() {
		System.out.println("Quack");
		
	}

}
