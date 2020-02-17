package collectionPackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		LinkedHashSetExample s1 = new LinkedHashSetExample (101, "Tony", "Virginia","571-733-5412");
		
		ListIteratorExample1 l1 = new ListIteratorExample1(101, "Tony", "Virginia", "847-084-8478");

		set.add("Loic");
		set.add("Loica");
		set.add("loic");
		set.add("Loica");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
		System.out.println(it.next());
		}
		
		

	}

}
