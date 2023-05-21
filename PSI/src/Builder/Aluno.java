package Builder;



public class Aluno {

	private String matricula;
	
	private String nome;
	
	Aluno (AlunoBuilder builder) {
	this.matricula = builder.matricula;	
	this.nome = builder.nome;
	
	}
	
	public static AlunoBuilder builder() {
		return new AlunoBuilder();
	}
	
}
