import java.io.*;
interface Paydetails
{
	double da=0.10;//10%
	double hra=0.05;//5%
	int ma=150;//Rs.150
	double cps=1.2;//120%
	void calculatePay();
}
class Employee implements Paydetails
{
	int bs,eno;
	double np;
	String ename;
	BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
	Employee()
	{
		bs=0;
	}
	void getdata()throws IOException
	
	{
		System.out.println("Enter Employee Name:");
		ename=x.readLine();
		System.out.println("Enter Employee Number:");
		eno=Integer.parseInt(x.readLine());
		System.out.println("Enter the Basic Salary:");
		bs=Integer.parseInt(x.readLine());
	}
	public void calculatePay(){
		np=bs+(da*bs)+(hra*bs)+(ma)+(cps*bs);
	}	
	void display()
	{
		System.out.println("********Employee Details*********");
		System.out.println("---------------------------------");
		System.out.println("Employee Name        :"+ename);
		System.out.println("Employee Number      :"+eno);
		System.out.println("Basic Salary         :"+bs);
		System.out.println("Dearness Allowance   :"+(da*bs));
		System.out.println("House Rent Allowance :"+(hra*bs));
		System.out.println("Medical Allowance    :"+(ma));
		System.out.println("Contribution Pension :"+(cps*bs));
		System.out.println("Net Pay              :"+np);
		System.out.println("---------------------------------");
	}
}
class Pay{
	public static void main(String arg[])throws IOException{
		Employee e=new Employee();
		e.getdata();
		e.calculatePay();
		e.display();
	}
}
