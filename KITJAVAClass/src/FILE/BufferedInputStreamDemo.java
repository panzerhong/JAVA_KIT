package FILE;
import java.io.BufferedInputStream;
import java.io.DataInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		
		byte b[] = new byte[300];
		try{
			FileInputStream fis = new FileInputStream("C:\\Users\\yinma\\Desktop\\Hello.txt"); // Read the file from the specific location
			BufferedInputStream bis = new BufferedInputStream(fis);	 // Read the data in the file and store it in the buffered(temporary memory)
		
			// Remember In Stream the data usually read in byte
			bis.read(b);// Convert the data in bis object reference the store in byte
			String str = new String(b);
			System.out.println(str);
			// output is (Hello World! I AM YIN MAZATIN)
			
			
			DataInputStream dis = new DataInputStream(fis);
			dis.read(b);
			String strdata = new String(b);
			System.out.println(dis); // Print the hash code of object reference dis 
			System.out.println(strdata+" as DataInputStream ");
			
			
		}catch (FileNotFoundException e)
		{
			System.out.println("Cannot Find the location of file");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("Cannot Open for the file");
			e.printStackTrace();
		}
	}

}
