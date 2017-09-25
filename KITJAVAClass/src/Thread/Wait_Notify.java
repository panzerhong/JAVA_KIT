package Thread;

public class Wait_Notify {
	
	public synchronized void hello()
	{
		System.out.println("Hello Before Wait");
		try{
			wait();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Hello after wait");
		notify();
	}
	
	
	public synchronized void world()
	{
		System.out.println("World Before Notify");
		notify();
		try
		{
			wait();
			System.out.println("World After Notify");
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Wait_Notify wn = new Wait_Notify();
		
		Thread t1 = new Thread(new Runnable()
		{
			@Override
			public void run() {
					wn.hello();
			}
			
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run()
			{
				wn.world();
			}
		});
		t2.start();
	}

}

class a extends Thread 
{
	@Override
	public void run()
	{
		System.out.println("Simply Thread");
	}
	public static void main(String[] args) {
		a obj = new a();
		obj.start();
	}
	
}