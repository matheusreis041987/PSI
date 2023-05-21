package TemplateMethod;

public abstract class Mensagens {
	
	final void imprimirMensagens() {
		mensagemConcreta();
		mensagemBemVindo();
		mensagemDespedida();
		System.out.println("Imprimir mensagens");
	}
	
	public void mensagemConcreta() {
		System.out.println("Imprimir mensagem concreta.");
	}
	
	public abstract void mensagemBemVindo();
	
	public abstract void mensagemDespedida();

}
