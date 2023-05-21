package Observer3;

public class Teste {

	public static void main(String[] args) {
		
		CoordenadorPilantra c1 = new CoordenadorPilantra();
		
		FuncionarioDesconfiado f1 = new FuncionarioDesconfiado("João", c1);
		
		f1.atualizar("Abriu o computador");
		

	}

}
