import java.io.*;
class dec
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Decimal Number:");
		int dec=Integer.parseInt(x.readLine());
		int bin=0,d;
		int i=1;
		/*while(dec!=0)
		{
		d=dec%2;
		bin+=d*Math.pow(10,i);
		dec/=2;
		i++;
		}*/
		while(dec>0)
		{
			bin+=(dec%2)*i;
			dec/=2;
			i*=10;
		}
		
		System.out.println("Binary:"+bin);
		/*
		System.out.println("Val"+(-4+1/2+2*-3+5.0));
		*/
	}
}	


