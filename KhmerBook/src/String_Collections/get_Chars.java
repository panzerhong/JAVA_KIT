package String_Collections;
//void getChars( int sourceStart, int sourceEnd, char target[],int targetStart);

public class get_Chars {
	
	public static void main(String[] args) {
		String name = "My name is YIN MAZATN";
		
		int start = 3;
		int finish = 8;
		
		char ch[] = new char[finish-start];
		
		name.getChars(start,finish,ch,0);
		System.out.println(ch);
	}

}
