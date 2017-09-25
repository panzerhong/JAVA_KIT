package File_IO;
import java.io.*;
import java.io.IOException;

/*The DataOutputStream stream lets you write the primitives to an output source.
Following is the constructor to create a DataOutputStream.

The DataOutputStream stream lets you write the primitives to an output source.
Syntax
DataOutputStream out = DataOutputStream(OutputStream out);
*/
public class DataInput_Stream {
	
	public static void main(String[] args) throws IOException {
		// writing string to a file encoded as modified UTF-8
		//FileOutputStream objout = new FileOutputStream("A:\\Testing\\file.txt");
		DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("A:\\Testing\\file.txt"));
		
		dataOut.writeUTF("hello world, I am yin mazatin");
		
		// Reading data from the same file
		FileInputStream objInput = new FileInputStream("A:\\Testing\\file.txt");
		DataInputStream dataIn = new DataInputStream(objInput);

			String k = dataIn.readUTF();
			System.out.println(k+" ");
	}

}
