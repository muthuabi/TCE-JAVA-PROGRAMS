import java.io.*;
class Matrix
{
	public static void main(String agr[])throws IOException
	{
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Row:");
		int m=Integer.parseInt(x.readLine());
		System.out.println("Enter the Column:");
		int n=Integer.parseInt(x.readLine());
		int a[][]=new int[m][n];		
		int b[][]=new int[m][n];	
		int c[][]=new int[m][n];	
		System.out.println("Enter the Matrix 1:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=Integer.parseInt(x.readLine());
		System.out.println("Enter the Matrix 2:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				b[i][j]=Integer.parseInt(x.readLine());
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				c[i][j]=a[i][j]+b[i][j];		
		System.out.println("Matrix 1:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println("Matrix 2:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
		System.out.println("Sum of Two Matrices:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
	}
}
