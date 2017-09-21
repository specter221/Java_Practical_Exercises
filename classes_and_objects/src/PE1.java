

import java.util.Scanner;

public class PE1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");

        String s= sc.nextLine();
        String rev="";

        System.out.println("the entered string is :"+s);

        for(int i=s.length()-1;i>=0;--i)
        {
            rev +=s.charAt(i);
        }

        System.out.println(rev);
        if(s.equals(rev))
        {
            System.out.println("It is a palindrome");

        }
        else
            System.out.println("Not a palindrome");


    }



}


