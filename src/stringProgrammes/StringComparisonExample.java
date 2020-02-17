package stringProgrammes;

public class StringComparisonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hi my name is Ipanga.";
		String s1= "Hi my name is Ipanga";
		String s2= new String("Hi my name is Ipanga.");
		String s3= "Hi my name iz ipanga.";
		
		String s4 = "Vishnu";
		String s5 = "VISHNU";
		String s6 = "Vishnu";
		
		String a = "bwanamusosi";
        System.out.println("To know the lenght of the String contents");
		System.out.println(a.length());
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s));
		
		System.out.println(s4.equals(s5)); //false
		System.out.println(s4.equalsIgnoreCase(s5)); //true
		System.out.println(s4.equalsIgnoreCase(s6));  //true
		
		System.out.println(s4 == s5);
		
		

	}

}
