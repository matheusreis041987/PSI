package TratamentoExcecao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EnviarEmail {

	
	public void envia(String email, String assunto, String texto, File arquivo) throws EmailException {
		
		if (email == null) {
			throw new EmailException();
		}
		
		System.out.println("Enviar email,enviar");
	}
	
	public void abrirArquivo(String caminho) throws IOException {
		
		File novoArquivo = new File(caminho);
		
		
	}
	
}
