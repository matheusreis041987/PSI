package Trabalho1;

public class Teste {

	public static void main(String[] args) {
		
		Agencia ag1 = new Agencia();
		ContaPoupanca c1 = new ContaPoupanca();
		ContaCorrente c2 = new ContaCorrente();
		Cliente matheus = new Cliente("Matheus", "12121212121", ag1, c1);
		Cliente thiago = new Cliente("Thiago", "13321212121", ag1, c2);
		
		System.out.println(Cliente.quantidadeClientes);

	}

}
