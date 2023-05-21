package Mvc;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela1 extends JFrame {

	JButton btOk = new JButton("Ok");
	
	public Tela1() {
		super("Minha primeira Tela");
		setSize(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btOk.addActionListener(new Tela1Controller());
		
		JPanel pane = new JPanel();
		pane.add(btOk);
		add(pane);
		
		setVisible(true);
		
	}
	
}
