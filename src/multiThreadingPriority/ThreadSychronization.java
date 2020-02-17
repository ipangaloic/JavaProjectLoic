package multiThreadingPriority;

public class ThreadSychronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedBlockExample obj= new SynchronizedBlockExample();
		//SynchronizationExample obj= new SynchronizationExample();
		MyThread1 t= new MyThread1(obj);
		Thread2 t1= new Thread2(obj);
		t.start();
		t1.start();

	}

}
