package Trabalho2;

public class Usuario {

	private String nome;
	private int idade;
	 String cpf;
	private static String criador;
	AcessoBanco bd;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public static String getCriador() {
		return criador;
	}
	public static void setCriador(String criador) {
		Usuario.criador = criador;
	}
	
	public Usuario (String nome, int idade, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		
	}
	

	
	public void alterarUsuario (Usuario usuario, String cpf) {
				
		bd.usuario = usuario;
		
		
	}
	
}
