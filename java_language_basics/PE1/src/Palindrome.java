import java.util.Scanner;

class Pe1 {
    public static void main(String[] args) {

        int num, reversedInteger = 0, remainder, originalInteger;
        int sum = 0;

        System.out.println("Enter the number ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        originalInteger = num;

        while (num != 0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }
        while (num != 0) {
            if (num % 2 == 0) {
                sum = sum + (num % 10);
            }
            num = num / 10;
        }

        num = originalInteger;
        if (originalInteger == reversedInteger && sum >= 25) {
            System.out.println(originalInteger + " is a palindrome. and the sum is greater than 25 ");
        } else if (originalInteger == reversedInteger && sum <= 25) {
            System.out.println(originalInteger + " is a palindrome. and the sum is less than 25");

        } else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}