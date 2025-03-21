import java.io.*;
class Convert
{
	static String rev(String s)
		{
			String t="";
			for(int i=(s.length()-1);i>=0;i--)
				t+=s.charAt(i);
			return t;
		}
	static String hexa(int d)
	{
		String h="";
		String hex="0123456789ABCDEF";
		while(d>0)
		{
			int r=d%16;
			if (r<10)
				h+=r;
			else
				h+=hex.charAt(r);
			d/=16;
		}
		//System.out.println("HexaDecimal:"+rev(h));
		return rev(h);
	}
	static String binary(int d)
	{
		String b="";
		while(d>0)
		{
			int r=d%2;
			b+=r;
			d/=2;
		}
		//System.out.println("Binary:"+rev(b));
		return rev(b);
	}
	static String octal(int d)
	{
			String o="";
			while(d>0)
			{
				int r=d%8;
				o+=r;
				d/=8;
			}
		//System.out.println("Octal:"+rev(o));
		return rev(o);
	}
	public static void main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		int n,c;
		do 
		{
			
			System.out.println("\tMenu\n1.Decimal to Binary\n2.Decimal to Octal\n3.Decimal to HexaDecimal\n4.Exit");
			System.out.print("Enter the Choice:");
			c=Integer.parseInt(x.readLine());
			switch(c)
			{
				case 1:  
						System.out.println("Enter the Decimal Number:");
						n=Integer.parseInt(x.readLine());
						System.out.println(n+" in Binary:"+binary(n));
						break;
				case 2:
						System.out.println("Enter the Decimal Number:");
						n=Integer.parseInt(x.readLine());
						System.out.println(n+" in Octal:"+octal(n));
				        break;
				case 3:
						System.out.println("Enter the Decimal Number:");
						n=Integer.parseInt(x.readLine());
						System.out.println(n+" in HexaDecimal:"+hexa(n));
				        break;
				case 4:
						System.out.println("Exit");
						break;
				default:
						System.out.println("Invalid Choice");
			}
		}while(c!=4);					
	}
}