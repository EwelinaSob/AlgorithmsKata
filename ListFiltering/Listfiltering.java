package Kata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listfiltering {
	  
	public static List<Object> filterList(final List<Object> list) {
		List nlist = new ArrayList(list);
		
		Iterator iter= nlist.iterator();
		while(iter.hasNext()) {
		Object elt = iter.next();
		if (elt instanceof String )
			iter.remove();}
		
		       
		    return new ArrayList(nlist);
		  }


	public static void main(String[] args) {
		
		
		List list = List.of(1, "Ala", 2, "Bob");
		List list1 = List.of(1, 2);
	
		System.out.println(list1.equals(Listfiltering.filterList(list)));
		
	}

}
