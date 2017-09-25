package Thread;

public class Thread_Wait {
	Thread t1 = new Thread(new Runnable(){
		@Override
		public synchronized void run()
		{
				System.out.println("Hello from t1");
		}
	});
	
	Thread t2 = new Thread(new Runnable(){
		@Override
		public synchronized void run()
		{
				System.out.println("Hello from t2");
		}
	});
	
	Thread t3 = new Thread(new Runnable(){
		@Override
		public synchronized void run()
		{
			System.out.println("Hello from t3");
		}
	});
	
	
	public static void main(String[] args) throws InterruptedException,IllegalMonitorStateException {
		Thread_Wait obj = new Thread_Wait();
		
		try
		{
			obj.t1.wait();
			obj.t1.start();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		obj.t2.start();
		obj.t2.notify();
	
		obj.t3.start();
		
	}
}
