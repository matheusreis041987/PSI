package Observer3;

import java.util.ArrayList;

public interface Coordenador {
			
	void registrarObservador(Funcionario o);
	void removerObservador(Funcionario o);
	void notificarObservador();

}
