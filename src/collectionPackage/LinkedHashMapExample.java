package collectionPackage;


import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;


public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap <Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(100, "A");
		map.put(101, "B");
		map.put(null, "C");
		map.put(null, null);
		map.put(104, "E");
		map.put(05, "F");
		
		for (Map.Entry<Integer, String> m : map.entrySet()){
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		System.out.println("Keys:" + map.keySet());
		System.out.println("Values: " + map.values());
		System.out.println("Both keys and values :" + map.entrySet());
		
	}

}
