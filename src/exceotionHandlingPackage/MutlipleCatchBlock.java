package exceotionHandlingPackage;

public class MutlipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\ 
		try{    
        int a[]= {10, 20, 30, 40, 50}; 
        
        
        System.out.println(a[20]);
        a[6]= 10/0;  
        //Si les 2 sont dans 2 lignes differentes donc la priorite reivient a la premiere ligne
       }    
		// Will implemented first because of priority
	      catch(ArithmeticException e)  
          {  
           System.out.println("Arithmetic Exception occurs");  
          }    
	
	    catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }  
 

	       catch(Exception e)  
	          {  
	           System.out.println("Parent Exception occurs");  
	          }    
       System.out.println("rest of the code");    
       
}  
}
