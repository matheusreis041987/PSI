package Observer2;

import java.util.Observable;
import java.util.Observer;

public class RevistaInformatica extends Observable {

	private int edicao;
	
	public void setNovaEdicao(int novaEdicao) {
		
		this.edicao = novaEdicao;
		
		setChanged();
		notifyObservers();
		
	}
	
	public int getEdicao() {
		
		return edicao;
	}
	
}
