package multipleThreadingPackage;

public class ThreadingCreationExample extends Thread {
	public void run(){
		System.out.println("Thread is in Running state");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadingCreationExample t = new ThreadingCreationExample();
		t.start();
		System.out.println(t.getName());
		t.setName("Loic");
		System.out.println(t.getName());
		System.out.println(t.getId());
	}}