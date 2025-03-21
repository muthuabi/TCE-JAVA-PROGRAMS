import java.io.*;
class Sorting
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Limit:");
		int n=Integer.parseInt(x.readLine());
		int a[]=new int[n];
		System.out.println("Enter Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(x.readLine());
		}
		System.out.println("Elements:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<n;i++)
			for (int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		System.out.println("After Sort:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}

		