import java.io.*;
interface ExamA
{
	void PercentCalculate();
}
class StudentA
{
	BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
	String name;
	int rno;
	void getdata(int i)throws IOException
	{
		System.out.println("Enter the Details of StudentA "+i+":");
		System.out.println("Enter the Name:");
		name=x.readLine();
		System.out.println("Enter the Roll no:");
		rno=Integer.parseInt(x.readLine());
	}
	void display(int i)
	{
		System.out.println("------------------------------------");
		System.out.println("       StudentA "+i+" Mark Statement");
		System.out.println("------------------------------------");
		System.out.println("StudentA Name     :"+name);
		System.out.println("StudentA Roll No  :"+rno);
	}
}			
class ResultA extends StudentA implements ExamA
{
	BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
	int cia,sem,mark;
	void getdata(int i )throws IOException
	{
		super.getdata(i);
		for(i=0;i<5;i++)
		{
		System.out.println("For Subject "+(i+1)+":");
		System.out.println("Enter the CIA Mark(/50):");
		cia+=Integer.parseInt(x.readLine());
		System.out.println("Enter the Semester Mark(/50):");//If you get sem marks out of 100 then,
		sem+=Integer.parseInt(x.readLine());//you have to divide it /2 in PercentCalculate()
		}
	}
	void display(int i)
	{
		super.display(i);
		//System.out.println("CIA 1 Mark     	 :"+cia);
		//System.out.println("Semester Mark    :"+sem);
		System.out.println("Total Percentage :"+mark+"%");
		System.out.println("------------------------------------\n");
	}
	public void PercentCalculate()
	{
		mark=(cia/5)+(sem/5);
	}
}
class ExamAll
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		int i;
		System.out.println("Enter the No of Students:");
		int n=Integer.parseInt(x.readLine());
		ResultA r[]=new ResultA[n];
		for(i=0;i<n;i++)	
			r[i]=new ResultA();
		for(i=0;i<n;i++)
		{
			r[i].getdata(i+1);
			r[i].PercentCalculate();
		} 
		System.out.println("Details of Students  Marks:");
		for(i=0;i<n;i++)
			r[i].display(i+1);
	}
}
	

	
