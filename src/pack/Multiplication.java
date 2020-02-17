package pack;

public class Multiplication {
	void mul(int a, int b)
	{
	int c= a*b;
	System.out.println("Multiplication is" + c);

}
	void show()
	{ 
		this.mul(10, 30);
		/* So if the method is not parameterized which means it is empty,
		 * we are not going to put anything inside
		 *  */
	}
	
	/* Rule number 3 example is just below*/
	public Multiplication(){
		this(100, "Voishnu");
		System.out.println("Hello inside default constructor");
	}
	public Multiplication(int id, String name) {
		
		System.out.println(id + " " + name);
	}
}

