package krish_java.New;
import java.io.*;
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
		System.out.println("-----------------------------------------------");
		System.out.println("          Student "+i+" Mark Statement");
		System.out.println("-----------------------------------------------");
		System.out.println("Student Name     :"+name);
		System.out.println("Student Roll No  :"+rno);
		System.out.println("-----------------------------------------------");
		System.out.println(" Subjects   |   CIA  | Semester | Total ");
		System.out.println("-----------------------------------------------");
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
		System.out.println("Enter Subject "+j+" :");
		System.out.println("Enter the CIA  Mark(/50):");
		cia+=c[j]=Integer.parseInt(x.readLine());
		System.out.println("Enter the Semester Mark(/50):");
		sem+=s[j]=Integer.parseInt(x.readLine());
		}
	}
	void display(int i,int n)
	{
		super.display(i);
		for(int j=1;j<=n;j++)
		{
		System.out.println(" Subject "+j+"  |    "+c[j]+"  |   "+s[j]+"     |  "+(c[j]+s[j]));
		}
		System.out.println("-----------------------------------------------");
		System.out.println("              Total Percentage  :  "+mark+"%");
		System.out.println("-----------------------------------------------\n");
	}
	public void PercentCalculate()
	{
		mark=(cia/numofsub)+(sem/numofsub);
	}
}
class AlterEmark
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
	

	
