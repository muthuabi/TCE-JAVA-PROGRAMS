package Library;
import java.io.*;
public class Book
{
	BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
	String name,author;
	int price,no;
	public void getdata()throws IOException
	{
		System.out.println("Enter the Book Name:");
		name=x.readLine();
		System.out.println("Enter the Book Author");
		author=x.readLine();
		System.out.println("Enter the Book Number");
		no=Integer.parseInt(x.readLine());
		System.out.println("Enter the Book Price:");
		price=Integer.parseInt(x.readLine());
	}
	public void display() 
	{
		System.out.println("-------------------------------");
		System.out.println("      Book Details");
		System.out.println("-------------------------------");
		System.out.println("Book Name    :"+name);
		System.out.println("Book Author  :"+author);
		System.out.println("Book Number  :"+no);
		System.out.println("Book Price   :Rs."+price);
		System.out.println("-------------------------------");
	}
}

		