package keyword_final;

public class inher_subclass extends MessageError {
	public static void main(String[] args) {
		inher_subclass a = new inher_subclass();
		
		// Cannot Modify the value of final variable
		//a.OUT_ERROR = 10;
		//a.OUT_ERROR = a.IN_ERROR+a.DISKET_ERROR;
		
		System.out.println(a.OUT_ERROR+a.IN_ERROR);
	}

}
