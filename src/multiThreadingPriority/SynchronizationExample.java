package multiThreadingPriority;

public class SynchronizationExample {  
	synchronized void printNumber(int n){
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e)
		     {System.out.println(e);}  
		   }  
		  
		 }  
		}  