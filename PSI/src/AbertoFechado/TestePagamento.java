package AbertoFechado;

public class TestePagamento {

	public static void main(String[] args) {
		
		Pagamento pPix = new PagamentoPix();
		Pagamento pDep = new PagamentoDeposito();
		Pagamento pDeb = new PagamentoDebito();
		Pagamento pCre = new PagamentoCredito();
		
		
		
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		Compra compra3 = new Compra();
		Compra compra4 = new Compra();
		
		compra1.realizarPagamenmto(pDep);
		compra2.realizarPagamenmto(pCre);
		compra3.realizarPagamenmto(pDeb);
		compra4.realizarPagamenmto(pPix);
		

	}
	
	
	
}
