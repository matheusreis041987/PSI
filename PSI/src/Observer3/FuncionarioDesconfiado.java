package Observer3;

public class FuncionarioDesconfiado implements Funcionario {

	
	String nome;
	
	Coordenador coordenadorPilantra;
	
	
	public FuncionarioDesconfiado(String nome, Coordenador coordenador) {
		this.nome = nome;
		this.coordenadorPilantra = coordenador;
		coordenador.registrarObservador(this);
		
	}
	
	@Override
	public void atualizar(String atividade) {
		
		System.out.println(this.nome + ": " + atividade);
		
	}
	
	
	

}
