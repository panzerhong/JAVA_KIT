package Thread;

public class RunnableClass implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableClass t1 = new RunnableClass();
		Thread t2 = new Thread(t1);
		Thread t3 = new Thread(t1);
		t2.start();
		t3.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("runnableclass");
	}
}
