import java.io.*;
class ASort
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Limit:");
		int n=Integer.parseInt(x.readLine());
		String a[]=new String[n];
		System.out.println("Enter Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=x.readLine();
		}
		System.out.println("Elements:"); 
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<n;i++)
			for (int j=i+1;j<n;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp=a[i];
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

		