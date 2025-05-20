/*import java.io.*;
class Fb
{
	static int fibo(int n)
	{
		if (n==1||n==0)
			return n;
		else
			return (fibo(n-1)+fibo(n-2));
	}
	public static void main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter n:");
		int n=Integer.parseInt(x.readLine());
		System.out.println("Fibonacci Series:");
		for (int i=0;i<n;i++)
			System.out.print(fibo(i)+" ");
		
	}
}
*/
import java.io.*;
class Fb
{
	int fibo(int n)
	{
		if (n<=1)
			return n;
		else
			return (fibo(n-1)+fibo(n-2));
	}
	public static void main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		Fb f=new Fb();
		System.out.println("Enter n:");
		int n=Integer.parseInt(x.readLine());
		System.out.println("Fibonacci Series:");
		for (int i=0;i<n;i++)
			System.out.print(f.fibo(i)+" ");
		
	}
}