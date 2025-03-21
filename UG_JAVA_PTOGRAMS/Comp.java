import java.io.*;
class Comp
{
		static String compare(String s1,String s2)
		{
			int flag=2;
			String t;
		if(s1.length()>s2.length())
		{
			t=s1;
			for (int i=0;i<(s1.length()-s2.length());i++)
				s2+=" ";	
		}
		else
		{
			t=s2;
			for (int i=0;i<(s2.length()-s1.length());i++)
				s1+=" ";	
		}
		System.out.println("S1:"+s1);
		System.out.println("S2:"+s2);
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
			BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter String 1:");
			String x1=x.readLine();
			System.out.println("Enter String 2:");
			String x2=x.readLine();
			System.out.println("The Larger:"+compare(x1,x2));
		}
}

		