package pack;

public class StudentChildClass extends StudentSuperExample {
	int a, b, c=a+b;
	String name = "James";
	void show() {
		System.out.println(name);
		System.out.println(super.name);
		displayStudentDetails();
		super.displayStudentDetails();
		
	}
	void displayStudentDetails() {
		System.out.println("inside child class student details method");

	}
	public StudentChildClass() {
		super();
		System.out.println("Child class constructor");
	}
	public StudentChildClass(int a){
		super(10);
		System.out.println("This isnthye child parameterized constructor" + a);
	}
}
