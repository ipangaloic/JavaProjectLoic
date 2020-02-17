
public class RunningTestInterfaces implements SecondInterfaceTest {

	public void first(int e, int f){
		int z;
		z= e+f;
		System.out.println("The first operation is:" + z);
	}
	public void second(int g, int h){
		int t;
		t= g-h;
		System.out.println("The second opration is" + t);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunningTestInterfaces r = new RunningTestInterfaces();
		r.first(4,5);
		r.second(20,11);

	}

}
