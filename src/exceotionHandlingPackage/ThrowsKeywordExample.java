package exceotionHandlingPackage;

import java.io.IOException;

public class ThrowsKeywordExample {

	void a() throws IOException {
		throw new IOException("Exception occur");
	}
	void b() throws IOException {
		a();
	}
	void c(){
		try{
		 b();	
		} catch (IOException e) {
			e.printStackTrace();
			//System.out.println(e); Can be used but printStackTrace gives mre details
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsKeywordExample t= new ThrowsKeywordExample();
		t.c();
		System.out.println("Hello");
		
		
	}

}
