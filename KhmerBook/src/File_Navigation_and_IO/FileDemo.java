package File_Navigation_and_IO;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File f = null;
		
		String[] strs = {"A:\\test\\test1.txt","A:\\test\\test2.txt"};
		try
		{
			// for each string in string array
			for(String s : strs)
			{
				// create new file
				f = new File(s);
				
				// true if the file is executable
				boolean bool = f.canExecute();
				
				//find the absoulte path
				String a = f.getAbsolutePath();
				
				// prints absoulte path
				System.out.println(a);
				
				// prints
				System.out.println(" Is executable : "+ bool);
			}
		}catch (Exception e)
		{
			// if any I/O error occurs
			e.printStackTrace();
		}
	}
}
