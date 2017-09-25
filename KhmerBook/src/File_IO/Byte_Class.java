package File_IO;
import java.io.*;
/*
 * Java byte streams are used to input and output of 8-bit bytes.
 * Though there are many classes related to byte streams but the most frequently
 * used classes are, FileInputStream and FileOutputStream .
 * InputStream : The InputStream is used to read data from a source
 * OutputStream : The OutputStream is used to writing data to a destination*/
public class Byte_Class {
	
	public static void main(String[] args)throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try
		{
			
			in = new FileInputStream("A:\\Testing\\input.txt");
			out = new FileOutputStream("A:\\Testing\\output.txt");
			
			
		}finally
		
		{
			if(in != null)
			{
				in.close();
			}
			if(out != null)
			{
				out.close();
			}
				
		}
		
	}
	

}
