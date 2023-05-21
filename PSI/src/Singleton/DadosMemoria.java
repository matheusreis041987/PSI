package Singleton;

public class DadosMemoria {

	private String nome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	private static DadosMemoria unicaInstancia;
	
	private DadosMemoria() {}
	
	public static DadosMemoria getInstance() {
		
		
		if (unicaInstancia == null) {
			unicaInstancia = new DadosMemoria();
		}
		System.out.println("Objeto criado com sucesso!"); 
		return unicaInstancia;
		 
	}
	
	public void imprimir () {
		
	System.out.println("Imprimir nome: " + nome);
	System.out.println("Imprimir cpf: " + cpf);
	}
	
}
