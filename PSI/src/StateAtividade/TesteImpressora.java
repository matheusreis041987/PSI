package StateAtividade;

public class TesteImpressora {

	public static void main(String[] args) {
		
		Impressora i1 = new Impressora();
		
		i1.ligar();
		i1.ligar();
		i1.ligar();
		i1.imprimir();
		i1.desligar();
		i1.desligar();
		i1.desligar();
		i1.ligar();
		i1.ligar();
		i1.colocarTinta();
		i1.inserirPapel();
		i1.imprimir();
		i1.desligar();

	}

}
