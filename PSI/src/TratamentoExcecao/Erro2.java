package TratamentoExcecao;

public class Erro2 {

	public static void main(String[] args) {
		
		try {
			rodarArray();
		}
		catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("O limite de Array foi atingido");
		}
		catch (Exception ex) {
			System.out.println("O limite de Array foi atingido parte 2");
		}
		finally{
			System.out.println("Comando sempre executado.");
		}
	}
	
	public  static void rodarArray()  throws ArrayIndexOutOfBoundsException{
		
String mensagens[] = {"msg1", "msg2", "msg3", "ms4"};
		
		for (int i = 0; i<5; i++) {
			System.out.println("teste");
			System.out.println(mensagens[i]);
		}
	}
}


