package FIS_FOS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStreamDemo {
	public static void main(String[] args) {
		
		try
		{
			int ch = -1;
			FileInputStream fis = new FileInputStream("C:\\Users\\yinma\\Desktop\\hello.txt");
			System.out.println("File Opened Successfully");
			while ((ch = fis.read())!=-1)
			{
				System.out.println((char)ch);
			}
		}catch (Exception e) // catch(FileNotFooundException e| IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
