package Strategy;

public class Teste {

	public static void main(String[] args) {
		
		Pato p1 = new PatoMalhado();
		p1.executarQuack();
		p1.executarVoo();
		p1.mostrar();
		p1.nadar();
		p1.setComportamentoVoador(new VooNasPedras());
		p1.executarVoo();
		p1.setComportamentoQuackador(new Espirrar());
		p1.executarQuack();
		
		
		System.out.println("------------------------");
		
		Pato p2 = new PatoVermelho();
		p2.executarQuack();
		p2.executarVoo();
		p2.mostrar();
		p2.nadar();
		p2.setComportamentoVoador(new VoarComAsas());
		p2.executarVoo();
		p2.setComportamentoQuackador(new FicarMudo());
		p2.executarQuack();
		
		System.out.println("------------------------");

	}

}
