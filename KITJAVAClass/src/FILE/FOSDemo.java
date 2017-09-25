package FILE;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FOSDemo {
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\yinma\\Desktop\\Signup Database.txt");//Used for 
			
			System.out.println("WELCOME TO IDIOT REGISTRY");
			System.out.println("Enter your username : ");
			String name  = s.nextLine();
			System.out.println("Enter your password");
			String password = s.nextLine();
			
			String data = "Name : "+name+", Password : "+ password;
			
			byte []b = data.getBytes();
			fos.write(b);
			
			System.out.println("Success Rigestry...");	
			}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
