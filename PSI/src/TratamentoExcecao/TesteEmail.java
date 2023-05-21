package TratamentoExcecao;

import java.io.IOException;

public class TesteEmail {

	public static void main(String[] args) throws EmailException {

		EnviarEmail e1 = new EnviarEmail();

		e1.envia("Para", "Para leitura", "Favor ler o arquivo anexo",null );

		try {
			
			e1.abrirArquivo("C:\\Users\\Matheus\\Desktop\\MBA - ANALISE E PROJETO DE SISTEMAS\\PROXIMAS POS.txt");
		} catch(IOException io) {
			System.out.println("Arquivo não encontrado");
		}
		
		
		
	}

}
