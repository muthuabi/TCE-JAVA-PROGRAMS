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
	public int pop()
	{
		int t;
		if(top<=0)
		{
			System.out.println("Stack Empty");
			return 0;
		}
		else
		{
			t=a[--top] ;
			return t;
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
class  ImStack
{
	public static void  main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		Stack s= new Stack();
		/*System.out.println("(5 Elements Only)\nEnter Elements to push:");
		for(int i=0;i<5;i++){
			int c=Integer.parseInt(x.readLine());
			s.push(c);}*/
		s.push(5);
		s.push(15);
		s.push(15);
		s.push(15);
		s.push(15);
		s.push(15);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.empty();
		}		
}
		
			
			
		