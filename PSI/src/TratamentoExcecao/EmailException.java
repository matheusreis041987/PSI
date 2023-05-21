package TratamentoExcecao;

public class EmailException extends Exception {

	
	public String getMessage() {
		return "Email inexistente. Favor inserir um email válido";
	}
	
}
