import java.util.Scanner;

public class PE2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();

        if(n==4)
        {
            System.out.println("Power of 4");
        }
        else if(n==8)
        {
            System.out.println("Not a power of 4");
        }

        else if(n%4==0 && n%8==0 && n%2==0 && n%3!=0 && n%5!=0 && n%7!=0 && n%9!=0)
        {
            System.out.println("Power of 4");
        }
        else
            System.out.println("Not a power of 4");


    }




}
