import java.io.*;
class Matrixe
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Row:");
		int m=Integer.parseInt(x.readLine());
		System.out.println("Enter the Column:");
		int n=Integer.parseInt(x.readLine());
		int a[][]=new int[m][n];
		System.out.println("Enter Matrix Elements:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)   
					a[i][j]=Integer.parseInt(x.readLine());
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
					System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println("Enter the Element to Count the occurunces:");
		int z=Integer.parseInt(x.readLine());
		int count=0;
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				{
					if(z==a[i][j])
						count+=1;
				}
		if(count!=0)
				System.out.println("The Element: "+z+" has "+count+" Appearances ");
		else
				System.out.println("The Element: "+z+" has no Appearances");
	}
}
