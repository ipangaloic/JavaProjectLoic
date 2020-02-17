package collectionPackage;

import java.util.ArrayList;
import java.util.List;

public class ListIteratorExampleImplementation {

	public static void main(String[] args) {

		//Creating of list of ListIteratorExample1
		List<ListIteratorExample1> list = new ArrayList<ListIteratorExample1>();
		
		ListIteratorExample1 l1 = new ListIteratorExample1(101, "Tony", "Virginia", "847-084-8478");
		ListIteratorExample1 l2 = new ListIteratorExample1(102, "Gaby", "Kinshasa", "555-084-8478");
		ListIteratorExample1 l3 = new ListIteratorExample1(103, "Papy", "Kipushi", "847-888-8478");
		ListIteratorExample1 l4 = new ListIteratorExample1(104, "Angela", "Delhi", "565-875-8478");
		
		//You can't instantiate an interface
		
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		
		for (ListIteratorExample1 l : list) {
			System.out.println(l.id + " " + l.name + " " + l.address + " " + l.phone);
		}
	
	}

}
