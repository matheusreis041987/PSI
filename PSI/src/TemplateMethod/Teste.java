package TemplateMethod;

public class Teste {

	public static void main(String[] args) {
		
		 Mensagens m1 = new MensagemPT();
		 m1.imprimirMensagens();
		
		 System.out.println("===================================");
		 
		 Mensagens m2 = new MensagemEN();
		 m2.imprimirMensagens();
		 

	}

}
