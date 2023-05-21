package Trabalho2;

public class Teste {

	public static void main(String[] args) {


		Usuario.setCriador("Matheus Reis");

		System.out.println(Usuario.getCriador());
		
		Usuario matheus = new Usuario("Matheus Reis", 35, "12896856730");
		Musica m1 = new Musica("Imagine Dragon", 350, 2008, "Enemy");
		Musica m2 = new Musica("Iron Maiden", 800, 2006, "Fear of the Dark");
		
		AcessoBanco bd = new AcessoBanco();
		
		bd.addUsuario(matheus);
		bd.incluirMusica(m1);
		bd.incluirMusica(m2);
		
		//bd.usuario.setCpf("1231321321321");
		
	//bd.usuario.alterarUsuario(matheus, "1231232");
		
		matheus.setCpf("23321321");
		
		System.out.println(matheus.getCpf());
		
	}

}
