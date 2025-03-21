import java.io.*;
class Convert2
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		int h1[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		String h2="0123456789ABCDEF";
		System.out.println("Enter the HexaDecimal Value:");
		String h=x.readLine();
		h=h.toUpperCase();
		int dec=0;
		for(int i=(h.length()-1);i>=0;i--)
		{
			for(int j=0;j<16;j++)
			{
				if(h2.charAt(j)==h.charAt(i))
				{
					dec+=h1[j]*Math.pow(16,i);
				}
			}
			
		}
		System.out.println("Decimal:"+dec);
			
	}
}