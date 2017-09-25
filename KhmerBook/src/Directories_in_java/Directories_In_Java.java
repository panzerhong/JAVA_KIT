package Directories_in_java;

import java.io.File;

/*A directory is a File which can contain a list of other
 * files and directories. You use File object to create directories,
 * to list down files available in a directory.*/
public class Directories_In_Java {
	
	public static void main(String[] args) {
		String dirname ="A:\\testing\\hello\\world";
		File d = new File(dirname);
		// Create directory now.
		d.mkdirs();
	}
}
