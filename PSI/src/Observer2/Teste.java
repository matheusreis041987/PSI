package Observer2;

public class Teste {

	public static void main(String[] args) {
	int novaEdicao = 3;
	
	RevistaInformatica revistaInformatica = new RevistaInformatica();
	Assinante1 assinante1 = new Assinante1(revistaInformatica);
	revistaInformatica.setNovaEdicao(novaEdicao);
	 novaEdicao = 4;
	 revistaInformatica.setNovaEdicao(novaEdicao);
	
	}

}
