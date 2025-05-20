class Sort 
{
	public static void main(String arg[])
	{
		int n=Integer.parseInt(arg[0]);
		int a[ ]=new int[n];
		int t;
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(arg[i+1]);
		System.out.println("Array of Numbers:");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Sorted Array of Numbers:");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}
		
