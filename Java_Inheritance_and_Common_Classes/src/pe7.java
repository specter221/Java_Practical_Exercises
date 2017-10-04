import java.lang.*;
public class pe7 {
	public static void main(String[] args) {
	  try{  
		    int b[] = new int[5];
		    b[6] = 11;
		    int c[] = new int[-5];
		    Object obj = null;
		    obj.toString();
		   }  
		   catch(ArrayIndexOutOfBoundsException e1){System.out.println("IndexOutOfBoundException handled");}  
		   catch(NegativeArraySizeException e2){System.out.println("NegativeArraySizeException handled");}  
	  	   catch(NullPointerException e3){System.out.println("NullPointerException handled");}  
	  
	  		finally{
	  			System.out.println("finally block..."); 
		 }  
	} 
}
