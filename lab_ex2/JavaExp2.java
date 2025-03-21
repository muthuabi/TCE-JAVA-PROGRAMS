package lab_ex2;
import java.util.*;
class Area
{
	
	public void findArea(int x)
	{
			System.out.println("The Shape is Square");
			System.out.printf("Area of Square with Side %d is %d\n", x, x*x);
	}
	public void findArea(int x,int y)
	{
		if(x==y)
			findArea(x);
		else
		{
			System.out.println("The Shape is Rectangle");
			System.out.printf("Area of Rectangle with Length: %d and Breadth: %d is %d\n",x,y,x*y);
		}
	}
}
class Employee
{
	private String empname;
	private int empid;
	private String emprole;
	private double empsalary;
	private int performance;
	private static int empids[]=new int[10];
	private static int empCount = 0;

	public static void updateEmpId(int empid)
	{
		empids[empCount++] = empid;
		Arrays.sort(empids, 0, empCount);
	}

	public Employee()
	{
		empname="Some Employee";
		emprole="Unknown";
		empsalary=1000;
		performance=1;
		empid=(empCount == 0) ? 1 : empids[empCount - 1] + 1;
		updateEmpId(empid);
	}
	
	public Employee(String name, String role, double salary)
	{
		empname = name;
		emprole = role;
		empsalary = salary;
		empid=(empCount == 0) ? 1 : empids[empCount - 1] + 1;
		performance=2;
		updateEmpId(empid);
	}
	public Employee(String name, String role, double salary,int performance)
	{
		empname = name;
		emprole = role;
		empsalary = salary;
		empid=(empCount == 0) ? 1 : empids[empCount - 1] + 1;
		this.performance=performance;
		updateEmpId(empid);
	}
	public void empDetails()
	{
		System.out.println("Empid:"+empid);
		System.out.println("Empname:"+empname);
		System.out.println("Emprole:"+emprole);
		System.out.println("Empsalary:"+empsalary);
		System.out.println("Performance:"+performance);
	}
	public void getBonus()
	{
		System.out.println("Bonus: "+0.15*empsalary);
	}
	public void getBonus(int performance)
	{
		System.out.println("Bonus: "+((0.15*empsalary)+((performance/10)*(empsalary/2))));
	}

}
class Power
{
	public double findPower(int base,int exp)
	{
		if(exp<0)
			return Math.pow(base,exp);
		int power=1;
		while(exp>0){
			power*=base;
			exp--;
		}
		return power;
	}
	public double findPower(double base,double exp)
	{
		return Math.pow(base,exp);
	}

}
class Currency  
{
	String currencies[];
	private double conversions[][];
	int R,C;
	Scanner sc=new Scanner(System.in);
	public Currency()
	{
		R=3;
		C=3;
		currencies=new String[]{"INR","USD","EUR"};
		conversions=new double[][]{
			{1,1.0/81,1.0/90},
			{81,1,1.0/96},
			{90,1.04,1}
		};
	}
	public double calculateCurrency(int from,int to,int amount)
	{
		return amount*conversions[from][to];
	}
	public void displayCurrencies()
	{
		int index,amt,from,to;
		double res;
		for(index=0;index<R;index++)
		{
			System.out.printf("%d - %s\n",index,currencies[index]);
		}
		while(true)
		{
			System.out.println();
			System.out.println("FROM:");
			from=sc.nextInt();
			System.out.println("TO:");
			to=sc.nextInt();
			if(from<0 || from>=R || to<0 || to>=R)
			{
				System.out.println("INVALID COUNTRY INDEX!");
				continue;
			}
			break;
		}
		System.out.print("AMOUNT:");
		amt=sc.nextInt();
		res=calculateCurrency(from,to,amt);
		System.out.printf("%d %s = %.2f %s\n",amt,currencies[from],res,currencies[to]);
	}
}
public class JavaExp2
{
	public static void main(String[] args)throws InterruptedException
	{
		Currency cr=new Currency();
		Employee emp1=new Employee();
		Employee emp2=new Employee("Krish","Developer",50000);
		Employee emp3=new Employee("Muthukrishnan","Developer",50000);
		Power p=new Power();
		Area a=new Area();
		cr.displayCurrencies();
//		Thread.sleep(2000);
//		a.findArea(5);
//		Thread.sleep(1000);
//		a.findArea(5,7);
//		Thread.sleep(2000);
//		emp3.empDetails();
//		emp3.getBonus(10);
//		Thread.sleep(2000);
//		emp2.empDetails();
//		emp2.getBonus(10);
//		Thread.sleep(2000);
//		System.out.println(p.findPower(5,-1));
	}
}
