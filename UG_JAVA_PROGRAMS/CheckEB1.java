import java.io.*;
class EB
//  Unit                      Charges
//	upto 100                    RS.50//	100 to 300                  Rs.1.5/unit  //	300 to 500					RS.2/unit   //	Above 500					RS.3/unit
{
	int cno,cmr,omr;
	double rs;
	String cname;
	public void getdata(int i)throws  IOException
	{
		System.out.println("Enter Details of Consumer "+i+":");
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Consumer Name:");
		cname=x.readLine();
		System.out.println("Enter The Consumer Number:");
		cno=Integer.parseInt(x.readLine());
		System.out.println("Enter The Current Meter Reading:");
		cmr=Integer.parseInt(x.readLine());
		System.out.println("Enter The Old Meter Reading:"); 
		omr=Integer.parseInt(x.readLine());
	}
	public void calculate()
	{
		int unit=cmr-omr;
		if(unit<=100)
			rs=50;
		else if(unit>=100 && unit<=300)
			rs=50+(unit-100)*1.5;
		else if(unit>=300 && unit<=500)
			rs=50+(200*1.5)+(unit-300)*2;
		else
			rs=50+(200*1.5)+(200*2)+(unit-500)*3;
	}
	public void display(int i)
	{
		System.out.println("Consumer "+i+" Details:");
		System.out.println("-----------------------");
		System.out.println("Consumer Name:"+cname);
		System.out.println("Consumer Number:"+cno);
		System.out.println("Consumed Unit:"+(cmr-omr));
		System.out.println("Consumed Charges:Rs."+rs);
		System.out.println("-----------------------\n");
	}
}
class CheckEB1
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of Consumers:");
		int n=Integer.parseInt(x.readLine());
		EB t[]=new EB[n];
		int i;
		for(i=0;i<n;i++)
			t[i]=new EB();
		for(i=0;i<n;i++)
		{
		    t[i].getdata(i+1);
			t[i].calculate();
		}
		for(i=0;i<n;i++)
		   t[i].display(i+1);
	}
}			
		
	
		