package Observer;

public interface Publicador {

	void registrarObsercador(Observador o);
	void removerObservador(Observador o);
	void notificarObservadores();

	
	
}
