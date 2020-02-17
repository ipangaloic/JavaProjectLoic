package javaStringMethodAssignment;

public class StringProgramme {
	public static void main (String [] args){
		
			// TODO Auto-generated method stub
			String s= "IPANGA";
			String name= "What do you know about me";
			String s8= " Ipanga";
			String s9= "IpangaNyeaka";
			char ch[]={'L','o','i','c','a','v','a','l'};
			//Contains String
			System.out.println(name.contains("do you know")); //true
			System.out.println(name.contains("whats up")); //false
			
			//join String
	        String date = String.join("/","25","06","2018");    
	        System.out.print(date);    
	        String time = String.join(":", "12","10","10");  
	        System.out.println(" "+time);  
			

			String s1= "Hi my name is Ipanga";
			String s2= new String("Hi my name is Ipanga.");
			String s3= "Hi my name iz ipanga.";
			
			String s4 = "Loic";
			String s5 = "LOIC";
			String s6 = "loic";
			
			String a = "bwanamusosi";
	        System.out.println("To know the lenght of the String contents");
			System.out.println(a.length());
			
			//toLowerCase Method
			String slower= s.toLowerCase();
			System.out.println(slower);
			
			//Trim method
			System.out.println(s8.trim()+" is my name");
			
			//toUpperCase Method
			String supper= s.toUpperCase();
			System.out.println(supper);
			
			//valueOf
			String s10= String.valueOf(ch);
			System.out.println(s10);
			
			//compareTo
			System.out.println(s.compareTo(s1)); //1 because there is only one alphabet difference
			System.out.println(s.compareTo(s10)); //zero because they both equal
			
			
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
