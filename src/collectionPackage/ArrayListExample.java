package collectionPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		
		al.add("Vishnu");
		al.add("Shawn");
		al.add("Loic");
		al.add("Sid");
		al.add("Dilip");
		al.add("Santosh");
		
		System.out.println(al);
		
		System.out.println("iterating list withiterator");
		//Iterating list with Iterator
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		System.out.println("Iterating list with for each loop");
		//For each loop.
		for(String obj : al) {
			System.out.println(obj);
		}
		
		//Adding element to the end of the list.
		
		al.add("Philipp");
		System.out.println(al);
		
		al.add(0, "Rajesh");
		System.out.println(al);
		
		//Adding al list to new array list.
		ArrayList<String> al2 = new ArrayList<String>();
		al2.addAll(al);
		System.out.println("New List"+ " "+ al2);
		
		
		al2.remove(0);
		System.out.println(al2);
		
		//removeAll

	}

}
