package keyword_final;

public class inher_demo extends Demo{
	
	public static void main(String[] args) {
		Demo a = new Demo();
		inher_demo b = new inher_demo();
		
		Demo c = new inher_demo();
		inher_demo d = new inher_demo();
		
		System.out.println(a.y);
		System.out.println(b.y);
		System.out.println(c.y);
		System.out.println(d.y);
		//System.out.println(a.hello(4,5));
		System.out.println(a.hi(99,2));
	}

}
