package collectionPackage;

import java.util.HashMap;
import java.util.Comparator;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m= new HashMap<Integer, String>();
		m.put(1, "Vihnu");
		m.put(2, "Dilip");
		m.put(9, "Vikas");
		m.put(4, "Vishnu");
		m.put(5, "Santosh");
		
		//Simply sorting by key
		m.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
		
		System.out.println("Reversing the list");
		//reversing the list
		m.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		System.out.println("Comparing the value");
		m.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);

	}

}
