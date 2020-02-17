package pack;

public class Example {
	int id;
	String name;
	long addr;
	long phone;
	
	public Example(int id, String name,long addr){
		System.out.println("This is the first constructor");
	}
	public Example(int id, String name,long addr, long phone){
		this(int id, String name, long addr);
		System.out.println("This is the second constructor");
	}

}
