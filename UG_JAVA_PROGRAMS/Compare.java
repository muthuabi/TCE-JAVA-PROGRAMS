import java.io.*;
class Compare
{
	static int comp(int i1,int i2)
	{
			if(i1>i2)
				return i1;
			else
				return i2;
	}
	static String comp(String s1,String s2)
	{
		if (s1.compareTo(s2)>0)
			return s1;
		else
			return s2;
	}
	public static void main(String arg[])throws IOException
	{
			BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter String 1:");
			String x1=x.readLine();
			System.out.println("Enter String 2:");
			String x2=x.readLine();
			System.out.println("The Larger:"+comp(x1,x2));
			System.out.println("Enter integer 1:");
			int i1=Integer.parseInt(x.readLine());
			System.out.println("Enter integer 2:");
			int i2=Integer.parseInt(x.readLine());
			System.out.println("The Larger of Integers:"+comp(i1,i2));
	}
}