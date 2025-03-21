 import java.io.*;
class Except
{
	public static void main(String arg[])
	{
		try
		{
			BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Number 1:");
			int n1=Integer.parseInt(x.readLine());
			System.out.println("Enter the Number 2:");
			int n2=Integer.parseInt(x.readLine());
			System.out.println("Addition           :"+(n1+n2));
			System.out.println("Subtraction        :"+(n1-n2));
			System.out.println("Multiplication     :"+(n1*n2));
			System.out.println("Division           :"+(n1/n2));
			System.out.println("Remainder Division :"+(n1%n2));
		}
		catch(IOException e)
		{
			System.out.println("User Triggered Error :"+e);
		}
		catch(NumberFormatException e)
		{
			System.out.println("User Triggered Error :"+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("User Triggered Error :"+e);
		}
		catch(Exception e)
		{
			System.out.println("User Triggered Error :"+e);
		}
		finally
		{
			System.out.println("User Program Execution Terminated Properly...");
		}
	}
}
		
		