package collectionPackage;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m= new HashMap<Integer, String>();
		m.put(1, "Vihnu");
		m.put(2, "Dilip");
		m.put(9, "Vikas");
		m.put(4, "Vishnu");
		m.put(5, "Santosh");
		
		for(Map.Entry<Integer,String> map : m.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
		
	}

}
