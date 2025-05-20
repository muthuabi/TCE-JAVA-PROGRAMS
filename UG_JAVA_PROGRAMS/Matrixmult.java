import java.io.*;
class Matrixmult
{
	public static void main(String agr[])throws IOException
	{
	
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		int n1,n2,m1,m2;
		do
		{
		System.out.println("Enter the Row of  Matrix 1:");           
		m1=Integer.parseInt(x.readLine());
		System.out.println("Enter the Column of  Matrix 1:");    
		n1=Integer.parseInt(x.readLine());
		System.out.println("Enter the Row of  Matrix 2:");          
		 m2=Integer.parseInt(x.readLine());
		System.out.println("Enter the Column of  Matrix 2:");    
		n2=Integer.parseInt(x.readLine());
		if(n1!=m2)
			System.out.println(" Sorry ! Can't Perform Multiplication. \n Note: Column of First Matrix and Row of Second Matrix Must be Equal.\n Please Give Compatible Values Again"); 
		}while(n1!=m2);
		int a[][]=new int[m1][n1];		
		int b[][]=new int[m2][n2];	
		int c[][]=new int[m1][n2];	
		System.out.println("Enter the Matrix 1:");
		for(int i=0;i<m1;i++)
			for(int j=0;j<n1;j++)
				a[i][j]=Integer.parseInt(x.readLine());
		System.out.println("Enter the Matrix 2:");
		for(int i=0;i<m2;i++)
			for(int j=0;j<n2;j++)
				b[i][j]=Integer.parseInt(x.readLine());
		for(int i=0;i<m1;i++)
			for(int j=0;j<n2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<n1;k++)
					c[i][j]+=a[i][k]*b[k][j];
			}
		System.out.println("Matrix 1:");
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println("Matrix 2:");
		for(int i=0;i<m2;i++)
		{
			for(int j=0;j<n2;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
		System.out.println("Multiplication of Two Matrices:");
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<n2;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
	}
}
