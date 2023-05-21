package TratamentoExcecao;

import java.rmi.AccessException;

public class Erro3 {

	int x;
	int y;
	
	
	public Erro3(int x, int y) {
		this.x = x;
		this.y = y;

	}
	
	
	public double calcular() throws ArithmeticException {
		System.out.println("Resultado: " + x / y);
		return x / y;
	}
		
	
	
}






