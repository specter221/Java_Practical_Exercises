import java.lang.reflect.Array;

public class PE4 {

    public static void main(String[] args) {

       int x=-5;
        
        try {
            
            int arr1[]=new int[x];
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
        x=4;
        
        try {
            int arr2[]=new int[x];
            x=x+10;
            int y=arr2[x];
            
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
            try {
            
            String q=null;
            String l=q.split("jump")[1];
        }
        catch(Exception e) {
            System.out.println(e);
        }











    }
}


        
        
        
    
