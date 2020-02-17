package packageDmv;

import java.util.ArrayList;
import java.util.List;

public class DriverMain {

	public static void main(String[] args) {
		Dmv.fillUpDrivers();
		DriverFinder Df = new DriverFinder();

		Driver D = Df.getDriverByLicence("A19829829");
		System.out.println(D.toString());
		// List is use for the list of the table 
		List<Driver> DR1 = new  ArrayList<Driver>();
		DR1.addAll(Dmv.drivers.values());
		System.out.println(DR1.toString());
		
		//Pour obtenir the drivers by their name
		List<Driver> obj2 = Df.getDriverByName("Loic");
		System.out.println(obj2.toString());	
		
		List<String> D1 = Df.getAllDateOfBirth();
		System.out.println(D1.toString());
		
	}

}