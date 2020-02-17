package multipleThreadingPackage;

public class ThreadCreationByRunnableInterface implements Runnable {
	public void run(){
		System.out.println("Creating threading ");
	}

	public static void main(String[] args) {
		ThreadCreationByRunnableInterface t= new ThreadCreationByRunnableInterface();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("Hello");

	}

}
