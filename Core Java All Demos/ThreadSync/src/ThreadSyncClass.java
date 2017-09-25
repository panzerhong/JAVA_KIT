
public class ThreadSyncClass 
{
	int cnt=0;
	int i = 0;
	public void increment()
	{
		cnt++;
	}
	public void countTheValue()
	{
		Thread t1=new Thread(new Runnable()
		{	
			@Override
			public void run() 
			{
				for(i=0;i<10000;i++)
				{

					increment();
					if(i==5000)
					{
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}	
				}
			}
		});
		Thread t2=new Thread(new Runnable()
		{	
			@Override
			public void run() 
			{
				for(i=0;i<10000;i++)
					increment();
			}
		});
		
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException ie)
		{
			
		}
		System.out.println(cnt);
	}
	public static void main(String[] args) 
	{
		ThreadSyncClass tsc=new ThreadSyncClass();
		tsc.countTheValue();
	}

}
