package Thread;

class DisplayMessages implements Runnable{
	//Create a thread to implement Runnable
	private Thread t;
	private String message;
	private int i;
	public DisplayMessages(String message)
	{
		this.message = message;
	}
	
	
	public DisplayMessages(int i) {
		this.i=i;
	}
	
	public void run()
	{
			for (int i = 9;i>0;i--)
				System.out.println(i);
			int j=10;
			while(j>0)
			{
				System.out.println(message);
				j--;
			}
	}

	public void start() {
		
		System.out.println("Creating the start : "+message);
		t=new Thread(this);
		t.start();
		
		t = new Thread(this);
		t.start();
	}
}

public class DisplayMessage
{
	public static void main(String[] args) {
		DisplayMessages obj = new DisplayMessages("Hello world I am tin");
		
		obj.start();
		
		DisplayMessages obj1 = new DisplayMessages(9);
	}
}
