package FIS_FOS;

import java.io.FileInputStream;
import java.io.IOException;

public class FISUsingOffset {
	
	public static void main(String[] args) {
		String str="";					
		byte b[] = new byte[500];
		
		try
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\yinma\\Desktop\\hello.txt");
			
			fis.read(b,5,5);
			char chr[] = str.toCharArray();
			str = new String (b);
			System.out.println(str);
		}
		catch (IOException e)
		{
			System.out.println("Cannot open file");
			e.printStackTrace();
			
		}
	}

}
