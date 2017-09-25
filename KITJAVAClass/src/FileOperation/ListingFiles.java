package FileOperation;

import java.io.File;

public class ListingFiles {
	
	public static void main(String[] args) {
		File folde = new File("A:\\testing");// Attach the location of file in computer to the particular name folde
		
		if(folde.exists())
		{
			File f[] = folde.listFiles();
			
			for(int i = 0;i<f.length;i++)
			{
				System.out.println(f[1].getName());
			}
		}
	}

}
