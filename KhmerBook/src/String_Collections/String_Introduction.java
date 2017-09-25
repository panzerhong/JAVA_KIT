package String_Collections;
/*String is a class which has the syntax as below */
public class String_Introduction {
	
	public static void main(String[] args) {
		char ch [] = {'C','H','A','R','A','C','T','E','R'};
		System.out.println(ch);
		for(int i = 0;i<3;i++)
		{
			System.out.println(ch[i]);
		}
		
		byte ascii[] = {65,66,67,68};
		
		System.out.println(ascii);
		for(int i = 0;i<3;i++)
		{
			System.out.println(ascii[i]);
		}
		
		String s1 = new String ();
		String s11 = "MY STRING";
		for(int i = 0;i<3;i++)
		{
			System.out.println(s11);
		}
		String s2 = new String (ch);
		s2 = "Object";
//		System.out.println(s2);
		String s3 = new String(ch,3,8);
		System.out.println(s3);
		
		String s4 = new String (s2);
		System.out.println(s4);
		
		String s5 = new String (ascii);
		System.out.println(s5);
		
		String s6 = new String(ascii,1,3);
		System.out.println(s6);
	}

}
