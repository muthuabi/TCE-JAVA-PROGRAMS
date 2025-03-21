package lab_ex1;
import java.util.*;
class JavaExp1
{
	public static int count=0;
	private Scanner sc=new Scanner(System.in);
	public int add(int x,int y)
	{
		return x+y;
	}  
	public String add(String s1,String s2)
	{
		return s1+s2;
	}
	public void printFibo(int n,int first,int second)
	{
		if(n<=0)
			return;
		System.out.print(first+second+" ");
		printFibo(n-1,second,first+second);

	}
	public void printFibo(int n)
	{
		printFibo(n,-1,1);
	}
	public int findMissingNumber(int n)
	{
		int arr[]=new int[n];
		int i=1;
		int s=0;
		int missing=n,x;
		System.out.println("Enter "+(n-1)+" Numbers:");
		while(i++<n)
		{
			s+=sc.nextInt();
		}
		missing=(n*(n+1))/2-s;
		// while(i<n)
		// {
			// x=sc.nextInt();
			// arr[i]=x;
			// if(i!=x && missing==n)
				// missing=i;
			// i++;
		// }
		return missing;
	}
	public static void main(String[] args) throws Exception //InterruptedException
	{
		JavaExp1 jv=new JavaExp1();
		int ch;
		System.out.println("1.Basic Add\n2.String Concatenation\n3.Fibonacci\n4.Missing Number\n5.Exit");
		do
		{
			System.out.println("\nYour Choice:");
			ch=jv.sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter two Numbers");
				System.out.println("Sum of Two Numbers: "+jv.add(jv.sc.nextInt(),jv.sc.nextInt()));
				break;
			case 2:
				System.out.println("Enter two Strings");
				System.out.println("String Concatenation:\n"+jv.add(jv.sc.next(),jv.sc.next()));
				break;
			case 3:
				System.out.println("Enter No of Terms");
				jv.printFibo(jv.sc.nextInt());
				break;
			case 4:
				System.out.println("Enter the N");
				System.out.println("Missing Number is "+jv.findMissingNumber(jv.sc.nextInt()));
				break;
			case 5:
				System.out.println("Thank You!");
				break;
			default:
				System.out.println("INVALID");
				break;
			}
			Thread.sleep(1000);
		}while(ch!=5);
	}
}