package multipleThreadingPackage;

public class ThreadSleepMethodExample extends Thread {
	public void run() {
		for (int i=1; i<10; i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e);
			}
		System.out.println(i);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadSleepMethodExample t= new ThreadSleepMethodExample();
		ThreadSleepMethodExample t1= new ThreadSleepMethodExample();
		t.start();
		t1.start();
		t1.start();
		t.run();
		t1.run();
	}

}
