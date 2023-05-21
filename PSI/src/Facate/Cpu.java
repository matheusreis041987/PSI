package Facate;

public class Cpu {
	
	public void start() {
		System.out.println("Inicialização inicial");
	}

	public void execute() {
		System.out.println("Execute algo no processador");
	}
	
	public void load() {
		System.out.println("carregar registros");
	}
	
	public void free() {
		System.out.println("Liberar registradores");
	}
}
