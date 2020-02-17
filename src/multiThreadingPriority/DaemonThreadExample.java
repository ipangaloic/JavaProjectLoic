package multiThreadingPriority;

public class DaemonThreadExample extends Thread {
	public void run(){
		if (Thread.currentThread().isDaemon()){
			System.out.println("this is daemon thread");
		} else {
			System.out.println("this is a normal thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThreadExample d = new DaemonThreadExample();
		DaemonThreadExample d1 = new DaemonThreadExample();
		DaemonThreadExample d2 = new DaemonThreadExample();
		d.setDaemon(true);
		d.start();
		d1.start();
		d2.start();
	}

}
