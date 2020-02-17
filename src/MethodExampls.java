
public class MethodExampls {
int a = 10;
int b = 20;
int c;
 //creating method
		 void addition() {
			 c = a + b;
			 System.out.println("Addition result is = " + c);
}
		 void parameterizedMethod(int e, int d){
			 int f= d + e;
			 System.out.println(f);
			 //you can also write SysOUt(d + e);
			 
		 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExampls m = new MethodExampls();
		m.addition();
		m.parameterizedMethod( 100, 200);
		m.parameterizedMethod( 15, 200);
		m.parameterizedMethod( 120, 230);
	}

}
