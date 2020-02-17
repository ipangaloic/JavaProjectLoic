package packageDmv;

import java.util.ArrayList;
import java.util.List;

public class DriverFinder {
		
		public Driver getDriverByLicence(String Liesence) {
			
			return Dmv.drivers.get(Liesence);
			
		}
		
		public  List<Driver> getAllDrivers (){
			
			return (List<Driver>) Dmv.drivers.values();
			
		}
		
		public List<Driver> getDriverByName( String Name){
			List<Driver> driverlist= new ArrayList<Driver>();
			for(Driver obj : Dmv.drivers.values()){
				if(Name.equals(obj.getName())){
					driverlist.add(obj);
				}
			}
			return driverlist;
		}
		public List<String> getNamesAllDrivers (){
		List<String> namelist = new ArrayList<String>();
		for(Driver s : Dmv.drivers.values()){
			System.out.println(s.getName());
			}
		return namelist;
		}
			
	    public List<String> getAllDateOfBirth(){
		List<String>namelist = new ArrayList<String>();
		for(Driver s : Dmv.drivers.values()){
			System.out.println(s.getDateOfBirth());
		}
				return namelist;
	    }
	  
		}