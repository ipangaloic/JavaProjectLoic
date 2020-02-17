package pack;

public class StaticVariablePostExample {


	String name;
	int rollNo;
	static String college  = "DU";
	
	public StaticVariablePostExample(String n, int r) {
		name = n;
		rollNo = r;


	}
	void display() {
		//We don't want the print statement inside the constructor
		System.out.println(name + " "+ rollNo + " " + college);
	}
}

