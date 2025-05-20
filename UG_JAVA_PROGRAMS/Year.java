import java.io.*;
class Year
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		int y;
		System.out.println("Enter the Year:");
		y=Integer.parseInt(x.readLine());
		if(y%100==0)
		{
			if(y%400==0)
			{
				System.out.println("Leap Year");
			}
			else
			{
				System.out.println("Not Leap Year");
			}
		}
		else
		{
			if(y%4==0)
			{
				System.out.println("Leap Year");
			}
			else
			{
				System.out.println("Not Leap Year");
			}
		}
	}
}
		
		