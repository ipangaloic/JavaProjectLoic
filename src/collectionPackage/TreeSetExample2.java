package collectionPackage;

import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> set= new TreeSet<Integer>();
		set.add(100);
		set.add(00001);
		set.add(0210);
		set.add(6000);
		set.add(005);
		
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		
		System.out.println("Creating TreeSet with type String");
		TreeSet<String> t1= new TreeSet<String>();
		
		t1.add("A");
		t1.add("B");
		t1.add("C");
		t1.add("D");
		t1.add("E");
		
		System.out.println("Original Set:" +t1);
		System.out.println("Reverse Set:" +t1.descendingSet());
		System.out.println("Head Set :" + t1.headSet("B", true));
		//By default boolean is fault
		System.out.println("Sub Set :" +t1.subSet("A", true, "E", false));
		System.out.println("Tail Set:" +t1.tailSet("C", false));
		
	
	}

}
