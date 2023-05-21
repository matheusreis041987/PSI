package Mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela1Controller implements ActionListener {

	Pessoa pessoa = new Pessoa("Matheus");
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String command = e.getActionCommand();
		
		if ((command.equals("Ok"))) {
			//System.out.println("Ok is working");
			new Tela2(pessoa.getNome());
		}
		
	}

}
