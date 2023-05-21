package Observer3;

import java.util.ArrayList;
import java.util.Iterator;

public class CoordenadorPilantra implements Coordenador {

	private String ultimaAtividade;
	
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

	@Override
	public void registrarObservador(Funcionario o) {
		
		this.funcionarios.add(o);
	}

	@Override
	public void removerObservador(Funcionario o) {
		this.funcionarios.remove(o);
		
	}

	@Override
	public void notificarObservador() {
		for (Iterator iterator = funcionarios.iterator(); iterator.hasNext();) {
			Funcionario funcionario = (Funcionario) iterator.next();
			funcionario.atualizar(this.ultimaAtividade);
		}
		
	}
	
	public void coordenadorFazAlgo(String atividade) {
		this.ultimaAtividade = atividade;
		notificarObservador();
	}
	
}
