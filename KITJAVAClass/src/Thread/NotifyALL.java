package Thread;
class Test{
	synchronized void waitMethod(){
		try {
			System.out.println(Thread.currentThread().getName());
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
	synchronized void notifyMethod(){
	
		notifyAll();
		System.out.println("unlocking the threads");
	}
}

public class NotifyALL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test s = new Test();
		Thread t1 = new Thread(){
			public void run(){
				s.waitMethod();
			}
		};
		t1.start();
		Thread t2 = new Thread(){
			public void run(){
				s.waitMethod();
			}
		};
		t2.start();
		Thread t3 = new Thread(){
			public void run(){
				s.waitMethod();
			}
		};
		t3.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t4 = new Thread(){
			public void run(){
				s.notifyMethod();
			}
		};
		t4.start();
	}

}
