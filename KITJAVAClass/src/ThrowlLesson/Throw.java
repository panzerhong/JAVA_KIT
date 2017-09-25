package ThrowlLesson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Throw {
	public static void openFile(String pat)//Function Prototype , handle with try and catch
	{
		try
		{
			FileInputStream fis = new FileInputStream(pat);
			System.out.println("Success...");
		}
		
		catch (FileNotFoundException h)
		{
			System.out.println("Unsuccessful...");
			h.printStackTrace();
		}
	}
	
	protected static void calOpenFile() throws FileNotFoundException {
	
		openFile("C:\\Users\\yinma\\Desktop\\aaaa.txt");
		System.out.println("Hello in calopenfile");
	}
	
	public static void main(String args[]) 
	{
		try
		{
			calOpenFile();
		}catch (FileNotFoundException e)
		{
			System.out.println("Hello");
			e.printStackTrace();
		}
		
		System.out.println("Hello in main method");
	}

	
}
