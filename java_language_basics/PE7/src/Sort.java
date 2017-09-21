import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args)
    {

        int[] arr=new int[6];
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter elements...");
        for(int j=0;j<6;j++)
            arr[j]=sc.nextInt();
        System.out.println("Array elements are : ");
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

        Arrays.sort(arr); //Sorts arr[] in descending order

        System.out.printf("sorted array is : %s", Arrays.toString(arr));
    }
}
