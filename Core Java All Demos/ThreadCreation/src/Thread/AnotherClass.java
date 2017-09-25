package Thread;

public class AnotherClass extends Thread
{

	public void run()
	{
		System.out.println("Hello from ANother class");
	}
	public static void main(String args[]){
		AnotherClass obj = new AnotherClass();
		obj.start();
	}
	
	
	
}
