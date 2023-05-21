package Trabalho2;

import java.util.ArrayList;

public class AcessoBanco {

	Usuario usuario;
	Musica musica;
	ArrayList<Musica> listaMusicas = new ArrayList<Musica>();
	
	
	boolean addUsuario (Usuario usuario) {
		System.out.println("Usuario incluido com sucesso!");
		return true;
				
	}
	
	public Usuario recuperarUsuario () {
		
		Usuario usuario = new Usuario(null, 0, null);
				return usuario;
	}
	
	void incluirMusica (Musica musica) {
		
		listaMusicas.add(musica);
	}
	
	
}
