package packageDmv;
import java.util.HashMap;
import java.util.Map;



public class Dmv {

		public static Map<String, Driver> drivers;
			
		public static void fillUpDrivers () {
			
			drivers = new HashMap<String,Driver>();
			
			
			Driver d1 = new Driver();
			d1.setAddress("5661 derby CT");
			d1.setAge(19);
			d1.setDOB(2014, 2, 11);
			d1.setLiesence("A19829829");
			d1.setName("Loica");
			
			
			
			Driver d2 = new Driver();
			d2.setAddress("5661 derby CT");
			d2.setAge(19);
			d2.setDOB(2014, 2, 11);
			d2.setLiesence("A29829829");
			d2.setName("Loic");
			
			Driver d3 = new Driver();
			d3.setAddress("5661 derby CT");
			d3.setAge(19);
			d3.setDOB(2014, 2, 11);
			d3.setLiesence("A39829829");
			d3.setName("Loic");
		
			Driver d4 = new Driver();
			d4.setAddress("5661 derby CT");
			d4.setAge(19);
			d4.setDOB(2014, 2, 11);
			d4.setLiesence("A49829829");
			d4.setName("Loick");
			
			Driver d5 = new Driver();
			d5.setAddress("5661 derby CT");
			d5.setAge(19);
			d5.setDOB(2014, 2, 11);
			d5.setLiesence("A59829829");
			d5.setName("Ipanga");
			
			
			drivers.put("A19829829",d1);
			drivers.put("A29829829",d2);
			drivers.put("A39829829",d3);
			drivers.put("A49829829",d4);
			drivers.put("A59829829",d5);
			
			
			
			
		}

	}