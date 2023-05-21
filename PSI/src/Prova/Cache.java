package Prova;

public class Cache {

	private int id;
	private String serialNumber;
	private static Cache unicaInstancia;
	
	private Cache() {}
	
	public static Cache getInstance() {
		
		if (unicaInstancia == null) {
			unicaInstancia = new Cache();
		}
		return unicaInstancia;
		
	}
	
	public void imprimirInformacaoCache() {
		System.out.println("Id: " + id);
		System.out.println("Numero de Série: " + serialNumber);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	
	
	
	
	
}
