package fileIOPackage.copy;

import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
	
		FileOutputStream fout = new FileOutputStream("C:\\Users\\ipang\\Desktop\\ABC\\fileoutputstream.pdf");
		String s= "Hi my name is LOIC IPANGA.";
		//String s2="Le code entier"
		byte b[] = s.getBytes();
		fout.write(b);
		System.out.println("file created");
		
	}
		

}
