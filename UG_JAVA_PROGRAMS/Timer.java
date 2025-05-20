import java.io.*;
class Timer
{
	public static void main(String arg[])throws IOException,InterruptedException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		Thread t=new Thread();
		System.out.print("Enter the Minutes:");
		int n=Integer.parseInt(x.readLine());
		for(int i=n;i>=0;i--)
		{
			if(i<10)
				System.out.println("TMinus0"+i);
			else
				System.out.println("TMinus"+i);
			t.sleep(1000);
		}
	}
}
