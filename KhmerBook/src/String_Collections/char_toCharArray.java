package String_Collections;

public class char_toCharArray {
	public static void main(String[] args) {
		String str = new String("Hello I am zatin");
		
		char ch[];
		ch = str.toCharArray();
		
		for(int i = 0;i<str.length();i++)
		{
			System.out.println(ch[i]);
		}
		
		for(int i = 0;i<5;i++)
		{
			System.out.println(ch[i]);
		}
	}

}
