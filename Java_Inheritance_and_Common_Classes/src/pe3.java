import java.util.*;
public class pe3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str = { "India","United States","Germany","Egypt","czechoslovakia"}; 
		String[] strnew = new String[5];
		for(int i=0;i<5;i++)
		{
			strnew[i] = str[i].replaceAll("[aeiouAEIOU]","");
			char stro = str[i].charAt(0); 
			if(stro == 'A' || stro == 'E' || stro == 'I' || stro == 'O' || stro == 'U') {
			System.out.println(str[i].charAt(0)+strnew[i]);
			}
			else {
				System.out.println(strnew[i]);
			}
		}

	}		
}
