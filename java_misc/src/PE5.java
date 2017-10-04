import java.util.Scanner;
import java.util.regex.Pattern;

public class PE5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String input = sc.nextLine();
        String[] input1 = input.split(" ");

        int flag=0;
       for(String s:input1)
       {
        if (Pattern.matches(s, "Harry"))
        {
        flag=1;
        }
      else
        {
        continue;
        }

      }
    if(flag==1)
{
    System.out.println("is Harry here?:True");
}
   else
       {
        System.out.println("is Harry here?:False");
    }


    }

}
