package pack;

public class StudentSuperExample {
	String name = "Loic";
	void displayStudentDetails() {
		System.out.println("inside student method of parent class");
	}
public StudentSuperExample() {
	System.out.println("inside parent class constructor");
}
	public StudentSuperExample(int a){
		//this();
		System.out.println("This is the parent parameterized constructor" + a);
	}

}
