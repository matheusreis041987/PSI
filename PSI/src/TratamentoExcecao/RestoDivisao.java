package TratamentoExcecao;

public class RestoDivisao {

	public static void main(String[] args) {
		int a = 8;
		int b = 7;
		int c = 3;
		int d = 2;
		int e = 0;
		
		System.out.println((double) a / b);
		System.out.println(a % b);
		System.out.println(a % c);
		System.out.println((double) a / c);
		System.out.println((double) c / e);
		try {
			System.out.println( c / e);
		
		} catch (ArithmeticException aa) {
		
			System.out.println("Não se pode dividir por zero um número real");
		}
	}

}
