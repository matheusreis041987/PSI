package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class TesteIterator {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Strategy");
		lista.add("Observer");
		lista.add("Decorator");
		
		
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("Lista: " + string);
			
							
			
		}
		
		
		
		Set<String> set = new HashSet<String>();
		
		set.add("Strategy");
		set.add("Observer");
		set.add("Decorator");
		
		for (Iterator iterator1 = set.iterator(); iterator1.hasNext();) {
			String string2 = (String) iterator1.next();
			System.out.println("Set: " + string2);
		}

	}

}
