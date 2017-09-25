package Thread;

public class Anonymous {

	public static void main(String[] args) {
		Thread obj = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("object1");
			}
			
		});
		Thread obj2 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("o2");
			}
			
		});
		obj.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj2.start();
	}

}
