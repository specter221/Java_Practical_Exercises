import java.util.*;
public class pe1 {
	public static void main(String[] args) {
		StudentMarks.main(args);
		Scanner sc= new Scanner(System.in);	
		System.out.println(" Input number of rows of matrix :");
		int nr=sc.nextInt();
		System.out.println(" Input number of columns of matrix :");
		int nc=sc.nextInt();
		int[][] matrixA = new int[nr][nc];
		int[][] matrixB = new int[nr][nc];
		int[][] sum = new int[nr][nc];
		System.out.println("  Input elements of first matrix :");
		for(int i=0;i<nc;i++)
		{
			for(int j=0;j<nr;j++)
			{
				matrixA[j][i]=sc.nextInt();
			}
		}
		System.out.println("  Input elements of Second matrix :");
		for(int i=0;i<nc;i++)
		{
			for(int j=0;j<nr;j++)
			{
				matrixB[j][i]=sc.nextInt();
			}
		}
		System.out.println("  Sum of the matrices :");
		for(int i=0;i<nc;i++)
		{
			for(int j=0;j<nr;j++)
			{
				sum[j][i]=matrixA[j][i] + matrixB[j][i];
			}
		}
		for(int i=0;i<nr;i++)
		{
			for(int j=0;j<nc;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}
	class StudentMarks{
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);	
			System.out.println("Number of Students :");
			int numOfStudents = sc.nextInt();
			int[] stuGrades = new int[numOfStudents];
			for(int i=0;i<numOfStudents;i++)
			{
				stuGrades[i] = sc.nextInt();
				if(stuGrades[i]<0 || stuGrades[i]>100)
				{
					System.out.println("Error!!!Invalid Grades entered");
				}
			}
			
		}
	}
