package collectionPackage;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t= new TreeSet<String>();
		t.add("Vishnu");
		//t.add(null); doesn't work
		t.add("Vishnu");
		t.add("Dilip");
		t.add("Luic");
		t.add("Rajesh");
		
		for (String obj : t) {
			System.out.println(obj);
		}
		
		//Traversing element into descending order.
		
		Iterator<String> it = t.descendingIterator();
		

	}

}
