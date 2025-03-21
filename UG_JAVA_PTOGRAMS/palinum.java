class palinum
{
	public static void main(String arg[])
	{
		int p=1111,r=0;
		int n=1111;
		while(p>0)
		{
			int l=p%10;
			r=(r*10)+l;
			p/=10;
		}
		System.out.println("Reverse:"+r);
			if (r==n)
			System.out.println("Pali");
		else
		   System.out.println("Not Pali");
	}

}

	