package File_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class fileStreamTest {
	
	public static void main(String[] args) {
		try
		{
			byte bWrite[] = {11,21,3,40,5,12,32,5,64,6,4,2,4,6,4,3,6,2,5,6,5,};
			
		
			OutputStream os = new FileOutputStream("A:\\Testing\\test.txt");
			
			
			for(int x = 0;x<bWrite.length;x++)
			{
				os.write(bWrite[x]);// writes the bytes
				
			}
			os.close();
			
			
			InputStream is = new FileInputStream("A:\\Testing\\test.txt");
			int size = is.available();
			
			for(int i = 0;i<size; i++)
			{
				System.out.println((char)is.read()+" ");
			}
			is.close();
			
		}catch(IOException e)
		{
			System.out.println("Exception");
		}
	}
	
}

