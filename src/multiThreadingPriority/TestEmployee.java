package multiThreadingPriority;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Employee e= new Employee();
		new Thread(){
			public void run(){
				e.deposit(55000);
			}
		} .start();
		new Thread() {
			public void run(){
				e.deposit(85000);
			}
		} .start();
	}

}
