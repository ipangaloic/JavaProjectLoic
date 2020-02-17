package multiThreadingPriority;

public class Thread2 extends Thread{
	SynchronizedBlockExample s1;
	public Thread2 (SynchronizedBlockExample s1){
		this.s1=s1;
		
	}
public void run(){
	s1.printNumber(100);
}

}
