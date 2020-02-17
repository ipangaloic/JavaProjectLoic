package exceotionHandlingPackage;

public class TryCatchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a= 100/0;
		
		System.out.println(a);
		}
		catch (Exception e) {
			System.out.println(e);
			//to costumize the message which is to be displayed
			System.out.println("You can't divide the number by zero");
		}
		System.out.println("Hello Java");
		

	}

}
