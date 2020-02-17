package pack;

public class StaticMethodExample {
	int rollNo;
	String name;
	static String college = "DU";
	
	static void collegeRename(){
		college = "DUIT";
	}
public StaticMethodExample(int r, String n){
	name = n;
	rollNo = r;
}
void display() {

	System.out.println(name + " "+ rollNo + " " + college);
}
}
