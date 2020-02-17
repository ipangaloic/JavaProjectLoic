
public class MyClassInterfaceExample implements MyInterfaceExample{
	int a=10;
	int b=20;
	public void display( int a, int b) {
		System.out.println("The addition is", a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassInterfaceExample m = new MyClassInterfaceExample();
		m.display(a,b)
		
	}

}
