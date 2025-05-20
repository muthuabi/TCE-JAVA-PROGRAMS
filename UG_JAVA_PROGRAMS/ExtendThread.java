class NewThread extends Thread 
{
	NewThread()
	{
	// Create a new, second thread
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		start(); // Start the thread
	}
	// This is the entry point for the second thread.
	public void run() {
	try 
	{
		for(int i = 5; i > 0; i--) 
		{
			System.out.println("Child Thread: " + i);
			Thread.sleep(1000);
		}
	} 
	catch (InterruptedException e)
	{
		System.out.println("Child interrupted.");
	}
	System.out.println("Exiting child thread.");
	}
}
class ExtendThread 
{
	public static void main(String args[]) throws InterruptedException
	{
	 // create a new thread
	 new NewThread();
		for(int i = 5; i > 0; i--)
		{
			System.out.println("Main Thread: " + i);
			Thread.sleep(1000);
			
		}
		
	System.out.println("Main thread exiting.");
	}
}