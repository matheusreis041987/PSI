package TratamentoExcecao;

public class TesteErro3 {

	public static void main(String[] args) {
		
		Erro3 e1 = new Erro3(12,5);
		Erro3 e2 = new Erro3(11,0);
		
		try {
			e1.calcular();
			e2.calcular();
		} catch(ArithmeticException a) {
			System.out.println("Erro de cálculo aritmético.");
		}
		
		
	}

}
