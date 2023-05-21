package TemplateMethod2;

public class Cafeteria {

	public static void main(String[] args) {
		
		BebidaCafeina matheus = new Cafe();
		BebidaCafeina aurea = new Cha();
		
		matheus.prepararReceita();
		System.out.println("--------------------------------");
		aurea.prepararReceita();
		

	}

}
