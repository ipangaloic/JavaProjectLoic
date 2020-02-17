package stringProgrammes;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hi my name is");
		
	//String buffer append example.
		sb.append(" Vishnu");
		sb.append(" Giri");
		
		System.out.println("String buffer append output : " + "\n" + sb);
		
		//String buffer insert method example.
		sb.insert(2, " evryone");
		System.out.println("String buffer insert output : " + sb);
		
		//String buffer replace method.
		sb.replace(0,  2,  " Hello");
		System.out.println("String buffer replace output : " + sb);
		
		//String buffer delete method
		sb.delete(6, 14);
		System.out.println("String buffer delete output : " + sb);
		
		//String buffer reverse method example
		sb.reverse();
		System.out.println("String buffer reverse output : " + sb);
		

	}

}
