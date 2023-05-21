package Observer;

public class EstacaoClimatica {

	public static void main(String[] args) {
		
		DadosClima dadosClima = new DadosClima();
		
		VisorCondicoesAtuais condicoesAtuais = new VisorCondicoesAtuais(dadosClima);
		
		
		dadosClima.setMedicoes(30, 65, 30);
		dadosClima.setMedicoes(32, 70, 29);
		dadosClima.setMedicoes(25, 95, 32);
		DadosClima dadosClima1 = new DadosClima();
		VisorEstatisticaClima v1 = new VisorEstatisticaClima(dadosClima1);
		dadosClima1.setMedicoes(22, 95, 32);
		
		

	}

}
