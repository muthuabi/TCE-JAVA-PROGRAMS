import java.io.*;
class Stack
{
	int top;
	int a[]=new int[5];
	Stack()
	{
		top=0;	
	}
	public void  push(int n)
	{
		if(top>=5)
			System.out.println("Stack Full");
		else
		{
			a[top]=n;
			System.out.println("Element "+n+" Inserted");
			top++;
		}
	}
	public void pop()
	{
		if(top<=0)
			System.out.println("Stack Empty");
		else
		{
			int t=a[--top];
			System.out.println("Element "+t+" Deleted");
		}
	}
	public void empty()
	{
		if(top<=0)
			System.out.println("Stack is  Empty");
		else
			System.out.println("Stack is not  Empty");
	}
}
class  ImStackchoice
{
	public static void  main(String arg[])throws IOException
	{
		int c;
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		//int n=Integer.parseInt(x.readLine());
		Stack s= new Stack();
		do 
		{
				System.out.println("\n1.Push\n2.Pop\n3.Empty\n4.Exit");
				System.out.println("Enter Your Choice:");
				c=Integer.parseInt(x.readLine());
				switch(c)
				{
					case 1:
						System.out.println("Enter a element to Push:");
						int e=Integer.parseInt(x.readLine());
						s.push(e);
						break;
					case 2:
						s.pop();
						break;
					case 3:
						s.empty();
						break;
					case 4:
						System.out.println("Exit");
						break;
					default:
						System.out.println("Invalid Choice");
						break;
				}
		}while(c!=4);
	}		
	
}
		
			
			
		