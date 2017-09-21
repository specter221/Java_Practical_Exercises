import java.util.Scanner;

public class Condition {
    
    public static void main(String args[])
    {
        int n; // number declare
        System.out.println("Enter an integer to check if it is odd or even ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        if ( n % 2 == 0 && n>20 && n<30)// checks even
        {
            System.out.println("Jerry");
        }
        else
        if(n % 2 != 0 && n > 20 && n < 30)
        {
            System.out.println("Tom");
        }
        else System.out.println("invalid input");
    }
    }
