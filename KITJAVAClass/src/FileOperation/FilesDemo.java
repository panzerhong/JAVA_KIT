package FileOperation;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FilesDemo {
	
	public static void main(String args[])
	{
		File file = new File("A:\\hello");// If we don't give an extension , it is going to be a directory name, but after we create it's going to be file with the extension nothing
		
		if(file.exists())
		{
			System.out.println("Exists...");
		}
		else
		{
			System.out.println("NA Press 1 tor create a new file");
			int i = new Scanner(System.in).nextInt();
			try
			{
				if(i == 1)
				{
					file.createNewFile();
					System.out.println("File Created...");
				}
			}	catch (IOException e)
			{
				System.out.println("Failed to create the file");
			}
		}
	}
	
}
