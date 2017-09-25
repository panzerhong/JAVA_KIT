package Thread;
 class RunnableDemoInterf implements Runnable {
	
	private Thread t= null;
	private String threadName;
	
	public RunnableDemoInterf(String name)
	{
		try
		{
			threadName=name;
			System.out.println("Creating " + threadName);
		}catch(NullPointerException e)
		{
			System.out.println("CANNOT BE NULL");
			e.printStackTrace();
		}
	}
	

	public void run() {
		System.out.println("Running "+threadName);
		try
		{
			for(int i = 4;i>0;i--)
			{
				System.out.println("Thread : "+threadName +", "+i);
				int sum=0;
				System.out.println( sum=sum+i);
				// Let the thread sleep for a while .
				Thread.sleep(9000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Thread "+threadName+" interrupted.");
		}
		System.out.println("Thread "+threadName+" exiting");
	}
	
	
	public void start()
	{
		System.out.println("Starting " + threadName);
		if(t == null)
		{
			t = new Thread(this, threadName);		// DON'T Understand
			t.start();
		}
	}
}
 
	public class TestThread
	{
		public static void main(String[] args) {
			RunnableDemoInterf R1 = new RunnableDemoInterf(" Thread-1");
			R1.start();
			
			RunnableDemoInterf R2 = new RunnableDemoInterf(" Thread-2");
			R2.start();
		}
	}
/*If your class is intended to be executed as a thread then you can 
 * achieve this by implementinig a Runnable interface. You will need to 
 * follow three basic steps
 * 
 * Step1
 * As a first step you need to implement a run() method provided by a Runnable interface
 * This method provides an entry point for the thread and you will put your complete business
 * logic inside this method. Following is a simple syntax of the run() method
 * public void run()
 * 
 * Step2
 * As a second step, you will instantiate a Thread object using the following constructor
 * Thread(Runnable threadObj, String threadName);
 * Where, threadObj is an instance of a class that implements the Runnable interface
 * and threadName is the name given to the new thread.
 * 
 * Step3
 * Once a Thread object is created , you can start it by calling start() method, which
 * executes a call to run() method. Following is a simple syntax of stat() method:*/
