package Thread;

public class cla implements Runnable {
	
	public static void main(String[] args) {
		cla robj = new cla();
		Thread t1 = new Thread(robj);
		t1.start();
	}
	@Override
	public void run() {
		System.out.println("Helloxxxxxxxxxxxxxxx");
	}
}
