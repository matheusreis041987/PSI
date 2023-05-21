package Mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela3 extends JFrame{

	private String texto = "Clique aqui";
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	JButton botao = new JButton(getTexto());
	JFrame j1 = new JFrame();
	
	public Tela3() {
		super("Minha terceira tela");
		
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		botao.addActionListener(new Tela3Controle());
		
		JPanel pane = new JPanel();
		pane.add(botao);
		add(pane);
		
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Tela3 t3 = new Tela3();
	}

	
	
		
	
	
}
