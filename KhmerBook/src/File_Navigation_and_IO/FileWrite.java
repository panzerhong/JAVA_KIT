package File_Navigation_and_IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*This class inherits from the OutputStreamWriter class.
 * The class is used for writing streams of characters*/
public class FileWrite {
		public static void main(String[] args) {
			try
			{
				File file = new File("A:\\Testing\\Hello2.txt");
				// create the file
				file.createNewFile();
				
				// create a FileWriter Object
				FileWriter writer = new FileWriter(file);
				
				// Writes the content to the file
				writer.write("Hello world I am tinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hello world I am tinaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
				writer.flush();
				writer.close();
				
				//Create a FileReader Object
				FileReader fr = new FileReader(file);
				char [] a = new char[50];
				fr.read(a);
				for(char c : a)
					System.out.println(c);// prints the characters one by one
				fr.close();
				
				
			}catch (IOException e)
			{
				e.printStackTrace();
			}
		}
}
