// This program is not synchronized.
class Callme 
	{
		Thread t=new Thread();
			void call(String msg) 
			{
				System.out.print("[" + msg);
			try {
				Thread.sleep(1000);
				
				} 
			catch(InterruptedException e) {
				System.out.println("Interrupted");
				}
			System.out.println("]");
			}
	}
class Caller implements Runnable
 {
		String msg;
		Callme target;
		Thread t;
		public Caller(Callme targ, String s)
			{
				target = targ;
				msg = s;
				t = new Thread(this);
				t.start();
			}
		public void run() 
		{
			//try{
			target.call(msg);
			//t.wait();}catch(Exception e){ System.out.println(e);}
		}
}
class Synch
 {
	 
		public static void main(String args[])
		{
			
			Callme target = new Callme();
			Caller ob1 = new Caller(target, "Hello");
			
			Caller ob2 = new Caller(target, "Synchronized");
			Caller ob3 = new Caller(target, "World");
// wait for threads to end
			try {
				
				ob1.t.sleep(1000);
				ob2.t.yield();
				ob3.t.yield();
				}
			catch(Exception e) 
			{
				System.out.println("Interrupted");
			}
			System.out.println("Main Exiting");
		}
}