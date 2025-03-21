import java.io.*;
class Prime2
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		/*int m,n,j,i;
		int flag,count=0;
		System.out.println("Enter m:");
		m=Integer.parseInt(x.readLine());
		System.out.println("Enter n:");
		n=Integer.parseInt(x.readLine());
		for(i=m;i<=n;i++)
		{	flag=1;
			for(j=2;j<=(i/2);j++)
			{
				if(i%j==0)
				{
					flag=0;
				}
			}
			if (flag==1)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("Count of Prime Numbers:"+count);
		*/
		int flag=1;
		System.out.println("Enter the Number:");
		int n=Integer.parseInt(x.readLine());
		for(int i=2;i<(n/2);i++)
		{
			
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
			if (flag==1)
			{
				System.out.println("The Number is prime");
			}
			else
			{
				System.out.println("Not Prime");
			}
		
				
	}
}
			
		
		