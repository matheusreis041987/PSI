package Proxy;

public class TesteProxy {

	public static void main(String[] args) {
		Imagem imagem = new ProxyImagem("prova.pdf");
		
		imagem.mostrar();
		System.out.println("\n\n");
		imagem.mostrar();
	}

}
