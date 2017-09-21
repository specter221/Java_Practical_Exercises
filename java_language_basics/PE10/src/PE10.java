import java.util.Scanner;

public class PE10 {

    public static void main(String[] args) {
        int i;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the character");

        String word= sc.nextLine();
        System.out.println("The word is :" +word);

        Scanner scr =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scr.nextInt();


        for (i=0;i<n;i++)
        {
            System.out.print(word);
        }
    }




}



