import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PE1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements of the array");

        int n= sc.nextInt();
        Integer arr[]= new Integer[n];

        System.out.println("Enter the elements");

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i:arr)
        {
            System.out.println(i);
        }


        List <Integer> a1= new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println(a1);



    }
}