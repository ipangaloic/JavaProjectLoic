package pack;

public class ResultOfMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(MethodOverloading.addition(10,20));
System.out.println(MethodOverloading.addition(20, 10, 20));
// we don't need a an object to call a static method

MethodOverloading m = new MethodOverloading();
System.out.println(m.addition(15.2, 20.5));
	}

}
