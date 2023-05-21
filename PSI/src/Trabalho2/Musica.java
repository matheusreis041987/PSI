package Trabalho2;

public class Musica {

	private int duracaoMinutos;
	private String nomeMusica;
	private String autor;
	private int anoCriacao;
	
	
	public String getNomeMusica() {
		return nomeMusica;
	}
	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
	public int getDuracaoMinutos() {
		return duracaoMinutos;
	}
	public void setDuracaoMinutos(int duracao) {
		this.duracaoMinutos = duracao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoCriacao() {
		return anoCriacao;
	}
	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}
	
	
	
	public Musica (String autor, int duracao, int anoCriacao, String nomeMusica) {
		this.anoCriacao = anoCriacao;
		this.autor = autor;
		this.duracaoMinutos = duracao;
		this.nomeMusica = nomeMusica;
	}
	
	
}
