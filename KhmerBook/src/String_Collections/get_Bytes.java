package String_Collections;
/*Method getBytes() is used to contain the char as byte in array by
 * convert the feature to byte
 * 
 * Syntax
 * byte[] getBytes();*/
public class get_Bytes {
	public static void main(String[] args) {
		String str = "Now we demo about how to use getBytes method";
		
		byte b[] = str.getBytes();
		
		for(int i = 0;i<b.length;i++)
		{
			System.out.println((char)b[i]);
		}
	}
}
