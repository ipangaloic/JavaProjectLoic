package multiThreadingPriority;

public class Employee {
int salary= 45000;
synchronized void withdraw (int salary){
	System.out.println("withdrawing money" +salary);
	if (this.salary < salary) {
		System.out.println("Not sufficient balance");
		try{
			wait();
		}catch (Exception e){
			System.out.println(e);
		}
		this.salary -= salary;
		System.out.println("withdraw complete");
	} 
	
}
	synchronized void deposit(int salary)
	{
		System.out.println("depositing money");
		
		this.salary += salary;
		System.out.println("deposit complete");
		notify();
		
	}
}

