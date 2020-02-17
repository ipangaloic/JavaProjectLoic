package pack;

public class StaticVariableExample {

		String name;
		int rollNo;
		String college;
		
		public StaticVariableExample(String n, int r, String c) {
			name = n;
			rollNo = r;
			college = c;

		}
		void display() {
			//We don't want the print statement inside the constructor
			System.out.println(name + " "+ rollNo + " " + college);
		}
}
