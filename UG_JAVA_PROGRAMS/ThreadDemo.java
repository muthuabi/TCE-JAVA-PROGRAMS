// Create a second thread.
class NewThread extends Thread
{
	NewThread(String name) throws InterruptedException
	{
		// Create a new, second thread
		super(name);
		System.out.println("Child thread: "+name);
		start(); // Start the thread
		
	} 
	// This is the entry point for the second thread.
	public void run()
	{
		try 
		{
			for(int i = 5; i > 0; i--)
			{
				if(i%2!=0)
				System.out.println("Child Thread: " + i);
				Thread.sleep(5000);
			
			}
		}
		catch (InterruptedException e) 
		{
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}
class ThreadDemo 
{
	public static void main(String args[])throws InterruptedException
	{
		new NewThread("One"); // create a new thread
	try
	{
		for(int i = 5; i > 0; i--)
		{
			if(i%2==0)
			System.out.println("Main Thread: " + i);
			Thread.sleep(5000);

		}
	} 
	catch (InterruptedException e) 
	{
		System.out.println("Main thread interrupted.");
	}
		System.out.println("Main thread exiting.");
	}
}
