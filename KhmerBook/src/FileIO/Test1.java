package FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		// 1.	CHECK THE FILE IF IT IS EXISTS
//		File obj_file =new File("A:\\Testing\\hello.txt");
//		if(obj_file.exists())
//		{
//			System.out.println("The file is exist");
//		}
//		else
//		{
//			System.out.println("The file is not exist and we have created it below ");
//			try
//			{
//				obj_file.createNewFile();
//				
//			}catch(IOException e)
//			{
//				e.printStackTrace();
//			}
//		}
		
		//2.	CREATE THE FOLDER OR FILE IF IT IS NOT EXISTS
//		File o = new File("A:\\Testing\\hello");
//		File o1 = new File("A:\\Testing\\sak");
//		if(o.exists()&&o1.exists())	
//		{
//			System.out.println("The folders are exist");
//		}
//		else
//		{
//			o.mkdir();
//			o1.mkdir();
//			System.out.println("The folder is created");
//		}
		
		// 3.	CREATE THE FOLDER OR FILE IF IT IS NOT EXIST
//		File o = new File ("A:\\Testing\\hello\\world\\this is yin mazatin");
//		File o1 = new File ("A:\\Testing\\hello.txt\\");
//		File o2 = new File("A:\\Testing\\world.docx");
//		
//		if(o.exists())
//		{
//			System.out.println("the file are exist");
//		}
//		else
//		{
//			o.mkdirs();
//			
//			try {
//				o1.createNewFile();
//				o2.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			System.out.println("The file is not exist but we have created it");
//		}
		
		// 4.	LIST THE NAME OF FILE
//		File o = new File("A:\\Testing\\helloworld.txt");
//		File oo = new File("A:\\Testing\\world.docx");
//		if(o.exists()&&oo.exists())
//		{
//			System.out.println("The file is not exist");
//		}
//		else
//		{
//			System.out.println("The file is not exist but we have to creat it");
//			try{
//				o.createNewFile();
//				oo.createNewFile();
//			}catch(IOException e)
//			{
//				e.printStackTrace();
//				
//			}
//		}
//			
//		
//		
//		File o1[] = o.listFiles(); 
//		for(int i=0;i<o1.length;i++)
//		{
//			System.out.println(o1[i]);
//		}
		
		
		
//		5.	FileInputStream
		try
		{
			
			File obj = new File("A:\\Testing\\helloworld.txt");
			if(obj.exists())
			{
				System.out.println("The file is already exists");
			}
			else
			{
				System.out.println("The file is created in else block");
				obj.createNewFile();
			}
				
			
		FileInputStream fis = new FileInputStream("A:\\Testing\\helloworld.txt");
			byte b[] = new byte[100];
			fis.read(b);
			String s = new String (b);
			System.out.println("This is the text in the file");
			System.out.println(s);
			
			File obj2 = new File("A:\\Testing\\helloworldOutput.txt");
			obj2.createNewFile();
			
		FileOutputStream fisout = new FileOutputStream("A:\\Testing\\helloworldOutput.txt");
			byte user[] = new byte[100];
			byte pass[] = new byte[100];
			
			Scanner s1=  new Scanner(System.in);
			
			String str = new String();
			String num = new String();
			
			System.out.println("Enter username");
			str=s1.next();
			System.out.println("Enter passcode");
			num=s1.next();
			System.out.println("Thank you for signin");
			
			user=str.getBytes();
			pass = num.getBytes();
			
			fisout.write(user);
			fisout.write(pass);
			fisout.flush();// Clear Buffer
			fisout.close();// Closing File
		}
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			
		} catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}
}
