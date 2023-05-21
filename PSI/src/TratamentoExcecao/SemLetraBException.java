package TratamentoExcecao;

public class SemLetraBException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "Não existe letra B em sua frase";
	}
	
}
