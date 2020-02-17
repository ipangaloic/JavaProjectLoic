package pack;

public class Employee {
	int emp_id;
	String emp_name;
	long phone_no;
	
public Employee(int emp_id, String emp_name, long phone_no) {
	this.emp_id= emp_id;
	this.emp_name = emp_name; 
	this.phone_no = phone_no;	
	/*public Employee(int e, String name, long phone) 
	*emp_id=e;
	*phone_no=phone; this the difference btw with this and not (using this program,
	*it is still going to work
	*emp_name=name;
	*/
}
void show() {
	System.out.println(emp_id + " " + emp_name + " " + phone_no);
}

}
