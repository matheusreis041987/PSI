package Proxy;

public class ProxyImagem implements Imagem {

	private ImagemReal imagemReal;
	
	private String nomeArquivo;
	
	public ProxyImagem(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	@Override
	public void mostrar() {
		if (imagemReal == null) {
			imagemReal = new ImagemReal(nomeArquivo);
			imagemReal.mostrar();
		}
		
	}

}
