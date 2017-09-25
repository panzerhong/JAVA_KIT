package String_Collections;

public class charAt {
	
	public static void main(String[] args) {
		char ch;
		
		ch = "My name is yin mazatin".charAt(1);// It provides y to ch
		
		System.out.println(ch);
		
		String s = "Password";
		
		// Here is the Ascii value when we try to add something
		System.out.println("The Ascii value of w is 119");
		System.out.println(s.charAt(4)+s.charAt(4));
		System.out.println(s.charAt(4)+1);
		System.out.println(s.charAt(5));
		
	}

}
