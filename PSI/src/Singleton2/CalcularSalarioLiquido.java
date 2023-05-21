package Singleton2;

public class CalcularSalarioLiquido {
	
	private double salario = 0.0;
	private double gea = 0.0;
	private double ats = 0.0;
	private double inss = 0.0;
	private double ir = 0.0;
	public static CalcularSalarioLiquido unicaInstancia;
	
	private CalcularSalarioLiquido() {}
	
	
	public static CalcularSalarioLiquido  getInstance() {
		
		if (unicaInstancia == null) {
			unicaInstancia = new CalcularSalarioLiquido(); 
		}
		
		return unicaInstancia;
	}
	
	public double calcularLiquidoSalarial (double salario, double gea, double ats, double inss, double ir ) {
		this.ats = ats;
		this.gea = gea;
		this.inss = inss;
		this.salario = salario;
		this.ir = ir;
		
		double x = salario + gea + ats;
		double y = inss + ir;
		
		System.out.println("Remuneração bruta: R$ " + x );
		System.out.println("Descontos: R$ " + y );
		System.out.println("Remuneração bruta: R$ " + (x - y) );
		
		return x-y;
		
		
	}
	
	public double calcularLiquidoSalarial() {
		double x = salario + gea + ats;
		double y = inss + ir;
		
		System.out.println("Remuneração bruta: R$ " + x );
		System.out.println("Descontos: R$ " + y );
		System.out.println("Remuneração bruta: R$ " + (x - y) );
		
		return x-y;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getGea() {
		return gea;
	}


	public void setGea(double gea) {
		this.gea = gea;
	}


	public double getAts() {
		return ats;
	}


	public void setAts(double ats) {
		this.ats = ats;
	}


	public double getInss() {
		return inss;
	}


	public void setInss(double inss) {
		this.inss = inss;
	}


	public double getIr() {
		return ir;
	}


	public void setIr(double ir) {
		this.ir = ir;
	}
	
	
}
