import java.util.Scanner;

public class PE6 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character/number/symbol");
        char s= sc.nextLine().charAt(0);
        System.out.println("The entered value is :" +s);

        if(s>='A' && s<='Z') {
            System.out.println(s+ " is a Uppercase:");
        }
        else if(s>='a' && s<='z')
        {
            System.out.println(s+ " is a Lowercase:");
        }
        else if(s>='0' && s<='9')
        {
            System.out.println(s+ " is a Digit" );
        }
        else if(s>=57 && s<=65 )
        {
            System.out.println(s+ " is a Symbol" );
        }
        else if(s>=31 && s<=48 )
        {
            System.out.println(s+ " is a Symbol" );
        }
        else if(s>=90 && s<=97 )
        {
            System.out.println(s+ " is a Symbol" );
        }

    }

}
