import java.io.*;
class ZMatrix
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		System.out.println("Enter the Row which is also Column:");
		int m=Integer.parseInt(x.readLine());
		//System.out.println("Enter the Column:");
		//int n=Integer.parseInt(x.readLine());
		int a[][]=new int[m][m];
		System.out.println("Enter Matrix Elements:");
		for(int i=0;i<m;i++)
			for(int j=0;j<m;j++)
					a[i][j]=Integer.parseInt(x.readLine());
		for(int i=0;i<m;i++)
		{
			for(int j=0,k=-1;j<m-1;j++,k++)
      			sum+=a[0][j]+a[m-1][j+1]+a[k+1][k+1];
			break;
		}
		System.out.println("Sum="+sum);
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
					System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}