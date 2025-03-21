package my_package;
import java.io.*;
import java.util.*;
class Account
{
	int acno,bal;
	String name,type,adr;
	BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
	Account()
	{
		bal=500;
	}
	void getdata()throws IOException
	{
		System.out.println("Enter Name:");
		name=x.readLine();
		System.out.println("Enter Account Number:");
		acno=Integer.parseInt(x.readLine());
		System.out.println("Enter Address:");
		adr=x.readLine();
		System.out.println("Enter Type of Account:");
		type=x.readLine();
	}
	void putdata()
	{
		System.out.println("----------------------------------------");
		System.out.println("   Customer Details     ");
		System.out.println("----------------------------------------");
		System.out.println("Customer Name   :"+name);
		System.out.println("Customer AC No  :"+acno);
		System.out.println("Customer Address:"+adr);
		System.out.println("Customer AC Type:"+type);
		System.out.println("Customer Amount :"+bal);
		System.out.println("----------------------------------------\n");
	}
	void deposit()throws IOException
	{
		System.out.println("Enter the amount to deposit:");
		int a=Integer.parseInt(x.readLine());
		bal+=a;
	}
	void withdraw()throws IOException
	{
		System.out.println("Enter the Withdrawal amount:");
		int w=Integer.parseInt(x.readLine());
		if (w>bal-500)
			System.out.println("*****Sorry!Insufficient Amount*****");
		else
		{
			bal-=w;
			System.out. println("After Withdrawal of "+w+"\nThe Balance amount:"+bal);
		}
	}
}
class Loan extends Account
{ 
	int lno,lamt,nm;
	double emi,ri;
	BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
	Loan()
	{
		super();
		lno=lamt=nm=0;
		emi=ri=0;
	}
	void getdata()throws IOException
	{
		super.getdata();
		System.out.println("Enter the Loan Ac No:");
		lno=Integer.parseInt(x.readLine());
		System.out.println("Enter the Loan Amount:");
		lamt=Integer.parseInt(x.readLine());
		System.out.println("Enter the Rate of Interest:");
		ri=Double.parseDouble(x.readLine());
		ri=ri/(12*100);   //Converting Rate  of Interest to Percentage
		System.out.println("Enter the No of Months(duration):");
		nm=Integer.parseInt(x.readLine());
	}
	void emiCalc()
	{
		emi=lamt*ri*Math.pow((1+ri),nm)/(Math.pow((1+ri),nm)-1);
	}
	void putdata()
	{
		super.putdata();
		System.out.println("----------------------------------------");
		System.out.println("          Loan Details       ");
		System.out.println("----------------------------------------");
		System.out.println("Loan Ac no           :"+lno);
		System.out.println("Loan Amount          :"+lamt);
		System.out.println("Rate of Interest(%)  :"+ri);
		System.out.println("Duration(No.of.Months:"+nm);
		System.out.println("Loan Amount EMI      :"+emi);           
		System.out.println("----------------------------------------\n");
	}
}
class Bank
{
	public static void main(String arg[])throws IOException
	{
		Account a=new Account();
		Scanner sc=new Scanner(System.in);
		a.getdata();
		int c;
		System.out.println("1.Display\n2.Deposit\n3.Withdraw\n4.Exit");
		do
		{
			System.out.print("\nYour Choice:");
			c=sc.nextInt();
			switch(c)
			{
				case 1:
					a.putdata();
					break;
				case 2:
					a.deposit();
					break;
				case 3:
					a.withdraw();
					break;
				case 4:
					System.out.println("Thank You");
					break;
				default:
					System.out.println("Invalid Choice");

			}
		}while(c!=4);
	}
}

	