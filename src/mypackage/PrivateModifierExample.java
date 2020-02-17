package mypackage;

public class PrivateModifierExample {
	private int a = 100;
	private void show(){
		System.out.println("Hello");
	}
	public static void main (String [] args) {
		 PrivateModifierExample p = new PrivateModifierExample();
		 p.show();
	}
}
