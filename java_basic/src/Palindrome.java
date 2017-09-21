import java.util.Scanner;

class Palindrome
{
    public static void main(String[] args) {

        int num, rev = 0, remainder, orig;
        int sum =0;

        System.out.println("Enter the number ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        orig = num;


        while( num != 0 )
        {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num  /= 10;
        }

        num=orig;
        if (orig == rev)
        {

            while(num!=0)
            {
                if((num%10) % 2 == 0)
                {
                    sum = sum + (num/10);
                }
                num=num/10;
            }

            if
                    (sum>=25)

            {
                System.out.println(orig + " is a palindrome. and the sum is less than 25 ");
            }

            else System.out.println(orig + " is a palindrome. and the sum is greater than 25");
        }


        else
            System.out.println(orig + " is not a palindrome.");
    }
}

