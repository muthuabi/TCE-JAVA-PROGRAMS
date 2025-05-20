package krish_java;
class Prime
{
	public static void main(String arg[])
	{
		int m=Integer.parseInt(arg[0]);
		int n=Integer.parseInt(arg[1]);
		int count=0;
		int flag;	
		System.out.println("Prime Numbers between "+m+" and "+n+":");
		for(int i=m;i<=n;i++)
		{
			flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag!=1)
			{

				System.out.println(i);
				count+=1;
			}
		}
	System.out.println("Total  Count of Prime Numbers in the Range: "+count);

	}

}				
			
		