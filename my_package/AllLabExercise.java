package my_package;
import java.util.*;
class NumberFunctions
{
	int number;
	Scanner sc;
	public NumberFunctions()
	{
		sc=new Scanner(System.in);
	}
	public void addTwo()
	{
		int x=this.sc.nextInt();
		int y=this.sc.nextInt();
		System.out.printf("Sum of %d and %d is %d",x,y,x+y);
	}
	public void checkOddEven()
	{
		int x=this.sc.nextInt();
		System.out.printf(x%2==0?"%d EVEN":"%d is ODD",x);
	}
	public void factorial()
	{
		int x=this.sc.nextInt();
		int fact=x--;
		while(x>1)
			fact*=x--;
		System.out.printf("Factorial is %d",fact);
	}
	public void helloWorld(String name)
	{
		System.out.println("Hello World "+name);
	}
	public void isPrime()
	{
		int val=this.sc.nextInt();

		boolean isprime=true;
		for(int i=2;i<=(val/2)+1;i++)
			if(val%i==0)
			{
				isprime=false;
			}
		System.out.printf("%d is %s"+(isprime?"PRIME":"NOT PRIME"));
	}
}
public class AllLabExercise {
	public static void main(String[] args) {
		NumberFunctions num=new NumberFunctions();
//		num.checkOddEven();
		num.isPrime();
	}

}
