package Trabalho2;

public class testePessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Matheus Reis Costa", 194, "Masculino", null, 1300,120, 2000);
		Pessoa p2 = new Pessoa("Eduardo Carlos Segundo", 175, "Masculino", null, 2500,120, 2000);
		Empresa e1 = new Empresa("Serviço Federal de Processamento de Dados - SERPRO", "33683111000875", 120000000.65);
		p1.setEmpresa(e1);
		p2.setEmpresa(e1);
		
		e1.addFuncionarios(p1);
		e1.addFuncionarios(p2);
		
		for (Pessoa p : e1.getEmpregados()) {
			
			System.out.println(p.getNome());
		}
		
		
		Pessoa.quantPessoas();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		Pessoa.calcularPagamento(p1);
		System.out.println(" ");
		System.out.println(" ");
		Pessoa.calcularPagamento(p2);
		System.out.println(" ");
		System.out.println(" ");
		e1.folhaPagamento();
	}
	
	

}
