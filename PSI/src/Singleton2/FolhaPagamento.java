package Singleton2;

public class FolhaPagamento {

	public static void main(String[] args) {
		
		CalcularSalarioLiquido x = CalcularSalarioLiquido.getInstance();
		x.calcularLiquidoSalarial(10000, 1200, 300, 650, 2000);
		System.out.println("========================");
		x.setSalario(5000);
		x.calcularLiquidoSalarial();
		System.out.println(x.unicaInstancia);
		
		CalcularSalarioLiquido y = CalcularSalarioLiquido.getInstance();
		y.calcularLiquidoSalarial();
	}

}
