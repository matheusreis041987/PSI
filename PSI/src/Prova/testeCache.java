package Prova;

public class testeCache {

	public static void main(String[] args) {
		
		
		Cache x = Cache.getInstance();
		x.setId(1255521);
		x.setSerialNumber("125211BNHX12152");
		
		x.imprimirInformacaoCache();
		
		Cache y = x;
		
		y.setId(65556552);
		y.setSerialNumber("AAAAAb12214");
		y.imprimirInformacaoCache();
		
	

	}

}
