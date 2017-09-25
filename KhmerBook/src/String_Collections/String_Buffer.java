package String_Collections;

public class String_Buffer {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome StringBuffer");
		
		System.out.println("buffer : "+sb);
		System.out.println("length : "+sb.length());
		System.out.println("capacity : " +sb.capacity());
		//sb = sb.concat("hello");
		
		String s1 = "Hello";
		s1 = s1.concat("CUS");
		System.out.println(s1);
		StringBuffer s = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890QWERTYUIO");
		
		System.out.println("buffer : "+s);
		System.out.println("length : "+s.length());
		System.out.println("capacity : " +s.capacity());
	}
}
// the size of stringBuffer is automatically expanded.
//
