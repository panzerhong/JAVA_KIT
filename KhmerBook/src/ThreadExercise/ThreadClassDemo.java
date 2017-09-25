package ThreadExercise;

public class ThreadClassDemo {
 public static void main(String[] args) {
	 
	Runnable hello = new DisplayMessage("Hello");
	Thread thread1 = new Thread(hello);
	
	thread1.setDaemon(true);
	thread1.setName("hello");
	
	System.out.println("Starting hello thread...");
	thread1.start();
	
	Runnable bye = new DisplayMessage("Goodbye");
	Thread thread2 = new Thread(bye);
	thread2.setPriority(Thread.MAX_PRIORITY);
	thread2.setDaemon(true);
	System.out.println("Starting goodbye thread...");
	thread2.start();
 	}
}
