
public class ConstructorsExample {

	public ConstructorsExample() {
		System.out.println("Hello Java");
	}
	public ConstructorsExample(int a, String b) {
		System.out.println(a + " " + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorsExample c = new ConstructorsExample();
		ConstructorsExample c1 = new ConstructorsExample(10, "Vishnu");

	}

}
