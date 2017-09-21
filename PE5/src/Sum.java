import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        System.out.println("write numbers, if you write zero, program ends");
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
            do {
                number = input.nextInt(); //this reads number from input and store its value in variable number
                sum+= number; //here you add number to the total sum
               } while(number != 0); //just repeat cycle as long as number is not zero

            System.out.println("Sum is : " + sum);
        }

    }

