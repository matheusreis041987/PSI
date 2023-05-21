package TemplateMethod;

public class MensagemPT extends Mensagens {

	@Override
	public void mensagemBemVindo() {
		System.out.println("Bem vindo!");
		
	}

	@Override
	public void mensagemDespedida() {
		System.out.println("Adeus!");
		
	}

}
