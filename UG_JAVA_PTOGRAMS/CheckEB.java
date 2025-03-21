import java.io.*;
class EB
//  Unit                      Charges
//	upto 100                    RS.50
//	100 to 200                  Rs.1/unit  //	200 to 500					RS.2/unit   //	Above 500					RS.3/unit
{
	int cno,cmr,omr,unit,rs;
	String cname;
	public void getdata()throws  IOException
	{
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
		unit=cmr-omr;
		if(unit<=100)
			rs=50;
		else if(unit>=100 && unit<=200)
			rs=50+(unit-100)*1;
		else if(unit>=200 && unit<=500)
			rs=50+100+(unit-200)*2;
		else
			rs=50+100+(300*2)+(unit-500)*3;
	}
	public void display()
	{
		System.out.println("Consumer Name:"+cname);
		System.out.println("Consumer Number:"+cno);
		System.out.println("Consumed Unit:"+unit);
		System.out.println("Consumed Charges:Rs."+rs);
	}
}
class CheckEB
{
	public static void main(String arg[])throws IOException
	{
		EB t=new EB();
		t.getdata();
		t.calculate();
		t.display();   
	}
}			
		
	
		