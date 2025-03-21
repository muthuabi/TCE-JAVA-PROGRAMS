import java.io.*;
class MethodOverload
{
	/*int add(int x,int y)
	{
		return(x+y);
	}
	double add(double x,double y)
	{
		return(x+y);
	}*/
	String add(String s1,String s2)
	{
		String t;
		int flag=2;
		//return(x+y);
		/*if(s1.compareTo(s2)>0)
			return s1;
		else
			return s2;*/
		if(s1.length()<s2.length())
			t=s1;
		else
			t=s2;
		for(int i=0;i<t.length();i++)
		{
			if(s1.charAt(i)>s2.charAt(i))
			{
				flag=1;
				break;
			}
			else if(s1.charAt(i)<s2.charAt(i))
			{
				flag=0;
				break;
			}
		}
		if (flag==1)
			return s1;
		else if(flag==0)
			return s2;
		else
		{
			System.out.println("Both Are Equal");
			return s1;
		}
		
	}
	public static void main(String arg[])throws IOException
	{
		MethodOverload m=new MethodOverload();
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		/*System.out.println("Enter Two Integers:");
		int i1=Integer.parseInt(x.readLine());
		int i2=Integer.parseInt(x.readLine());
		System.out.println("Enter Two Double Numbers:");
		double d1=Double.parseDouble(x.readLine());
		double d2=Double.parseDouble(x.readLine());*/
		System.out.println("Enter Two Strings:");
		String s3=x.readLine();
		String s4=x.readLine();
		//System.out.println("Sum of Two Integers:"+m.add(i1,i2));
		//System.out.println("Sum of Two Double Numbers:"+m.add(d1,d2));
		System.out.println("Large of Two Strings:"+m.add(s3,s4));
	}
}