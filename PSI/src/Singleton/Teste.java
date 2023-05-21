package Singleton;

public class Teste {

	public static void main(String[] args) {
		
		DadosMemoria x = DadosMemoria.getInstance();
		x.setCpf("12896856730");
		x.setNome("Matheus Reis Costa");
		x.imprimir();
		
		DadosMemoria y = x;
		
		y.setCpf("11333187700");
		y.setNome("Andreia Cristina");
		y.imprimir();
		
		
	
		
	
		

	}

}
