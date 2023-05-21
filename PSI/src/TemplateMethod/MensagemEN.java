package TemplateMethod;

public class MensagemEN extends Mensagens {

	@Override
	public void mensagemBemVindo() {
		System.out.println("Welcome!");
		
	}

	@Override
	public void mensagemDespedida() {
		System.out.println("Bye bye!");
		
	}

}
