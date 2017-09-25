package Thread;

public class create extends Thread {

	public void run(){
		System.out.println("Hello From Run");
	}
	
	public static void main(String args[]){
		create t1 = new create();
		t1.start();
		
	}
}
