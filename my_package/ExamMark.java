package my_package;
import java.io.*;
class MarkException extends Exception
{
	//String s1;
	MarkException(String s)
	{
		super(s);
	}
}
interface Exam
{
	void PercentCalculate();
}
class Student
{
	BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
	String name;
	int rno;
	void getdata(int i)throws IOException
	{
		System.out.println("Enter the Details of Student "+i+":");
		System.out.println("Enter the Name:");
		name=x.readLine();
		System.out.println("Enter the Roll no:");
		rno=Integer.parseInt(x.readLine());
	}
	void display(int i)
	{
		System.out.println("------------------------------------");
		System.out.println("      Student "+i+" Mark Statement");
		System.out.println("------------------------------------");
		System.out.println("Student Name     :"+name);
		System.out.println("Student Roll No  :"+rno);
	}
}			
class Result extends Student implements Exam 
{
	BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
	int cia,sem,mark,numofsub;
	int c[];
	int s[];
	void getdata(int i ,int n)throws IOException
	{
		super.getdata(i);
		numofsub=n;
		c=new int[n+1];
		s=new int[n+1];
		for(int j=1;j<=n;j++)
		{
		System.out.println("Enter Subject "+j+" Marks:");
		do{
		System.out.println("Enter the CIA  Mark(/50):");

			c[j]=Integer.parseInt(x.readLine());
		 }while(c[j]<0 || c[j]>50);
		 cia+=c[j];
		 do{
		System.out.println("Enter the Semester Mark(/50):");
		s[j]=Integer.parseInt(x.readLine());
		}while(s[j]<0 || s[j]>50);
		sem+=s[j];
		}
	}
	void display(int i,int n)
	{
		super.display(i);
		for(int j=1;j<=n;j++)
		{
		System.out.println("------------------------------------");
		System.out.println("Subject "+j+":");
		System.out.println("----------------");
		System.out.println("CIA  Mark     	 :"+c[j]);
		System.out.println("Semester Mark    :"+s[j]);
		}

		System.out.println("------------------------------------\n");
		try{
			if(mark>100 || mark<0)
				throw new MarkException("Invalid Mark Percentage");
			System.out.println("Total Percentage :"+mark+"%");	
		}
		catch(MarkException me)
		{
			System.out.println(me);
		}
		System.out.println("------------------------------------\n");
	}
	public void PercentCalculate()
	{
		mark=(cia/numofsub)+(sem/numofsub);
	}
}
class ExamMark
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		int i;
		System.out.println("Enter the No of Students:");
		int n=Integer.parseInt(x.readLine());
		System.out.println("Enter the No of Subjects:");
		int nos=Integer.parseInt(x.readLine());
		Result r[]=new Result[n];
		for(i=0;i<n;i++)	
			r[i]=new Result();
		for(i=0;i<n;i++)
		{
			r[i].getdata(i+1,nos);
			r[i].PercentCalculate();
		} 
		System.out.println("Details of Students  Marks:");
		for(i=0;i<n;i++)
			r[i].display(i+1,nos);
	}
}
	

	
