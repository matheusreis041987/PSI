package Trabalho2;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private int altura;
	private Empresa empresa;
	private String genero;
	private ArrayList<Empresa> empresas = new ArrayList<Empresa>();
	public static int numeroInstancias = 0;
	private double sal = 0;
	private double gea = 0;
	private double fct = 0;
	private double inss = 0;
	private double vr = 0;
	
	public Pessoa (String nome, int altura, String genero, Empresa empresa, 
			double salario, double gea, double fct) {
		this.nome = nome;
		this.altura = altura;
		this.genero = genero;
		this.empresa = empresa;
		this.fct = fct;
		this.gea = gea;
		sal = salario;
		
		numeroInstancias +=1;
		
		System.out.println("Pessoa criada com sucesso!");
		
	}

	public static void quantPessoas() {
		
		System.out.println("Foram criadas até agora " + numeroInstancias + " pessoas.");
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}


	public void setEmpresas(ArrayList<Empresa> empresas) {
		this.empresas = empresas;
	}


	public static int getNumeroInstancias() {
		return numeroInstancias;
	}


	public static void setNumeroInstancias(int numeroInstancias) {
		Pessoa.numeroInstancias = numeroInstancias;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getGea() {
		return gea;
	}

	public void setGea(double gea) {
		this.gea = gea;
	}

	public double getFct() {
		return fct;
	}

	public void setFct(double fct) {
		this.fct = fct;
	}

	public double getInss() {
		return inss;
	}

	public void setInss(double inss) {
		this.inss = inss;
	}

	public double getVr() {
		return vr;
	}

	public void setVr(double vr) {
		this.vr = vr;
	}
	
	
	public static double calcularPagamento(Pessoa p) {
		
		double proventos = p.sal + p.fct + p.gea;
		
		if (p.sal <= 1302) {
			p.inss = p.sal * 0.075;
		} else if (p.sal > 1302 && p.sal <= 2571.29) {
			p.inss = p.sal * 0.09;
		} else if (p.sal > 2571.29 && p.sal <= 3856.94) {
			p.inss = p.sal * 0.12;
		} else if (p.sal > 3856.94 && p.sal <= 7507.49 ) {
			p.inss = p.sal * 0.14;
		} else if (p.sal > 7507.49) {
			p.inss = 7507.49 * 0.14;
		} else {
			System.out.println("Erro no cálculo do inss");
		}
		
		p.vr = p.sal * 0.06;
						
		double descontos = p.inss + p.vr;
		double pagamento = proventos - descontos;
		
		System.out.println(">============= CONTRA CHECHE =========================<");
		System.out.println("Nome do empregado: " + p.getNome());
		System.out.println(" ");
		System.out.println("----------------PROVENTOS------------------");
		System.out.println("Salario: R$" + p.sal);
		System.out.println("GEA: R$" + p.gea);
		System.out.println("FCT: R$" + p.fct);
		System.out.println("total proventos: R$ " + proventos);
		System.out.println(" ");
		System.out.println("----------------DESCONTOS------------------");
		System.out.println("INSS: R$" + p.inss);
		System.out.println("VR " + p.vr);
		System.out.println("total descontos: R$" + descontos);
		System.out.println(" ");
		System.out.println("--------------------------------------------");
		System.out.println(" ==> VALOR LÍQUIDO: R$" + pagamento);
		
		return pagamento;
	}
	
	
}
