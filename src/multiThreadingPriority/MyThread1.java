package multiThreadingPriority;

public class MyThread1 extends Thread {
	//SynchronizationExample s;
	SynchronizedBlockExample s1;
	public MyThread1(SynchronizedBlockExample s1){
		this.s1=s1;
		
	}
public void run(){
	s1.printNumber(5);
}
}
