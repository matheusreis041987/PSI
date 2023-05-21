package Mvc;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela2 extends JFrame {

	JLabel lblTexto = new JLabel();

	
	public Tela2(String texto) {
		
		super("Minha segunda tela");
		
		setSize(300,100);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.lblTexto.setText(texto);
		
		JPanel panel = new JPanel();
		panel.add(this.lblTexto);
		add(panel);
		
		setVisible(true);
		
		
	}


	
	
}
