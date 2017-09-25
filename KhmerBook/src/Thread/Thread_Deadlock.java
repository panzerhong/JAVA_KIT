package Thread;
/*Deadlock describes a situation where two or more threads are 
 * blocked forever, waiting for each other. deadlock occures when multiple
 * threads need the same lock but obtain them in different order. A java
 * multithreaded program may suffer from the deadlock condition because the
 * synchronized keyword causes the executinig thread to block while waiting for the 
 * lock , or monitor, associated with the specified object . 
 * 
 * */
public class Thread_Deadlock {
	
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String[] args) {
		ThreadDemo1 T1 = new ThreadDemo1();
		
		ThreadDemo2 T2 = new ThreadDemo2();
		
		T1.start();
		
		
		T2.start();
		
		
	}
	
	static class ThreadDemo1 extends Thread
	{
		public void run()
		{
			synchronized (Lock1)
			{
				System.out.println("Thread 1 : Holding lock 1...");
				System.out.println("helsadfasdfasdfasdfasdfasdfasdfasdf;;j;n;kj;lk;jk;iji;;");
				int sum = 23;
				System.out.println(4+sum);
				try
				{
					Thread.sleep(10);
					System.out.println("hello from synchronized lock 1");
				}
				catch (InterruptedException e)
				{
					
				}
				System.out.println("Thread 1: Waiting for lock 2...");
				
			}
			
			synchronized (Lock2)
			{
				System.out.println("Thread1: Holding lock 1& 2...");
			}
		}
	}

	
	

private static class ThreadDemo2 extends Thread
{
	public void run()
	{
		synchronized (Lock2)
		{
			System.out.println("Thread 2: Holding lock 2...");
			try
			{
				Thread.sleep(10);
			}catch(InterruptedException e)
			{
				
			}
			System.out.println("Thread 2 : Waiting for lock 1...");
			
			synchronized(Lock1)
			{
				System.out.println("Thread 2: Holding lock 1&2...");
			}
		}
	}
}





}
