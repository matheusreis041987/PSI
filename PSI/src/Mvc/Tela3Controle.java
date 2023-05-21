package Mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela3Controle implements ActionListener {

		Pessoa p1 = new Pessoa("Bernardo");
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String comando = e.getActionCommand();
		
		
		if(comando.equals("Clique aqui")) {
			System.out.println("Deu certo");
			
			new Tela1();
			new Tela2(p1.getNome());
			
		}
		
	}

}
