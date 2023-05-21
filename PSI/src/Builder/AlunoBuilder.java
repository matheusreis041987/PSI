package Builder;

public class AlunoBuilder {

	public String matricula;
	
	public String nome;
	
	public Aluno build( ) {
		return new Aluno(this);
	}
	
	public AlunoBuilder matricula(String matricula) {
		
		this.matricula = matricula;
		return this;
	}
	
	
	public AlunoBuilder nome(String nome) {
		this.nome = nome;
		return this;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
	
}
