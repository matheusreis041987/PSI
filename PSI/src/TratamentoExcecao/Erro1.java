package TratamentoExcecao;

public class Erro1 {

	public static void main(String[] args) {
		
		String mensagens[] = {"msg1", "msg2", "msg3", "ms4"};
		
		for (int i = 0; i<5; i++) {
			
			try {
				System.out.println("teste");
				System.out.println(mensagens[i]);
				
		
			}
			
			catch(ArrayIndexOutOfBoundsException aiobe) {
				
				System.out.println("O limite de Array foi atingido");
				
			}
			
			finally{
				System.out.println("Comando sempre executado.");
			}
		}
		
		System.out.println("===================================================");
		
		for (int i = 0; i<5; i++) {
			
			try {
				
				System.out.println(mensagens[i]);
				System.out.println("teste");
		
			}
			
			catch(ArrayIndexOutOfBoundsException aiobe) {
				
				System.out.println("O limite de Array foi atingido");
				
			}
			
			finally{
				System.out.println("Comando sempre executado.");
			}
		
	}
	
	
	
}
	
}
	


