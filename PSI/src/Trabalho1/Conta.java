package Trabalho1;

public abstract class Conta {

	protected int doc_conta;
	protected int dv_conta;
	protected String GerentedeAtendimento;
	
	// fazer construtor
	
	public int getDoc_conta() {
		return doc_conta;
	}
	public void setDoc_conta(int doc_conta) {
		this.doc_conta = doc_conta;
	}
	public int getDv_conta() {
		return dv_conta;
	}
	public void setDv_conta(int dv_conta) {
		this.dv_conta = dv_conta;
	}
	public String getGerentedeAtendimento() {
		return GerentedeAtendimento;
	}
	public void setGerentedeAtendimento(String gerentedeAtendimento) {
		GerentedeAtendimento = gerentedeAtendimento;
	}
	
	
	
	
}
