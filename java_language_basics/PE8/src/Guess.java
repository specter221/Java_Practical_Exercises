import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {

        int a=1, b=50, c=25,i,j;

        for (i=0;i<=b;i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess the number");
            int k=sc.nextInt();

            if(k==c)
            {
                System.out.println("u guessed right");
                break;
            }

            else if(k>c)
            {
                System.out.println("The number entered is greater than the original number");
            }
            else if(k<c)
            {
                System.out.println("The number entered is lesser than the original number");
            }
        }




    }
}
