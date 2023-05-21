package Proxy;

public class ImagemReal implements Imagem {

	private String nomeArquivo;
	
	
	public ImagemReal(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		this.loadFromDisk(nomeArquivo);
		
	}


	@Override
	public void mostrar() {
		System.out.println(String.format("Mostrando %s", nomeArquivo));
		
	}
	
	private void loadFromDisk(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	System.out.println(String.format("Carregando %s", nomeArquivo));
		
	}
	
	
}
