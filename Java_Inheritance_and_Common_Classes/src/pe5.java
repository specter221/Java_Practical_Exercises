import java.util.*;
public class pe5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers :");
		String inp = sc.next();
		String[] numbers = inp.split(",");
		int count = 0;
		if(numbers.length == 7) {
			for(int i=0;i<6;i++) {
				int x = Integer.parseInt(numbers[i]);
				int y = Integer.parseInt(numbers[i+1]);
				int differ = x-y;
				if(differ!=1) {
					count++;
				}
			}
		}
		else
		{
			System.out.println("non consecutive numbers");
			System.exit(0);
		}
		if(count == 0) {
			System.out.println("are consecutive numbers");
		}
		else {
			System.out.println("non consecutive numbers");
		}
		
	}

}
