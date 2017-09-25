package FileOperation;

import java.io.File;

public class Delete_all_file_in_folder {
	public static void main(String args[])
	{
		File folder = new File("A:\\testing");
		File f[] = folder.listFiles();
		System.out.println("All of this file name is deleted");
		
		for(int i = 0;i<f.length;i++)
		{
			System.out.println(f[i].getName());
		}
			
		for(int i = 0 ;i<f.length;i++)
		{
			f[i].delete();
		}
		
	}
}
