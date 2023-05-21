package TratamentoExcecao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Erro7 {
	
	public static void main(String[] args) {
		
		try {
			abreArquivo();
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		
		
		
	}
	
	
	public static void abreArquivo() throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("c:/Users/Matheus/Documents/GSRJO/MYRIAD/BDSERPRO_08-06-2021.xlsx");
		
	}
		

}

