import java.io.FileNotFoundException;
public class pe6 {
	pe6(String x){
		x = "Executing...........";
		System.out.println(x);
	}
	public static void main(String[] args) throws Exception{
		try {
			throw new FileNotFoundException();
		}
		catch(FileNotFoundException e){
			System.out.println("File not Found");			
		}
		finally {
			System.out.println("Finally executing.....");
		}
	}

}
