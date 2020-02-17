package fileIOPackage;

import java.io.FileInputStream;



public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin= new FileInputStream("C:\\Users\\ipang\\Desktop\\ABC\\fileoutputstream.pdf");
			int i=0;
			
			//Ces lignes sont a retenir 
			while ((i=fin.read()) != -1) {
				
				System.out.print((char)i);
			}
			fin.close();
		} 
		catch(Exception e){
			System.out.println(e);
		}

	}

}
