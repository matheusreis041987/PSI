package AbertoFechado;

public class Compra {

	Pagamento pagamento;
	
	public void realizarPagamenmto(Pagamento pagamento) {
		this.pagamento = pagamento;
		pagamento.pagar();
	}
	
	
}
