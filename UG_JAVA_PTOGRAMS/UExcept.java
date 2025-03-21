import java.io.*;
class UExcept
{
	public static void main(String arg[])
	{
		try 
		{
			BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter m:");
			int m=Integer.parseInt(x.readLine());
			System.out.print("Enter n:");
			int n=Integer.parseInt(x.readLine());
			if(n<0)
				throw new MyException(" Negative Exponent Error ");
			else
			{
				System.out.println("Power:"+Math.pow(m,n));
				/*
				int p=1;
				for(int i=0;i<n;i++)
					p*=m;
				System.out.println("Power:"+p);
				*/
			}
		}
		catch(MyException e)
		{
			System.out.println("User Error:"+e);
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}
class MyException extends Exception
{
	//String s1;
	MyException(String s)
	{
		//s1=s;
		super(s);
	}
	/*public String toString()
	{
		return s1;
	}*/
}
