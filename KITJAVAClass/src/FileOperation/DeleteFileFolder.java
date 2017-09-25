package FileOperation;

import java.io.File;

public class DeleteFileFolder {
	public static void main(String[] args) {
		File file = new File("A:\\testing\\New Microsoft Excel Worksheet.xlsx");
		File file1 = new File("A:\\testing\\New Microsoft PowerPoint Presentation.pptx");
		File file2 = new File("A:\\testing\\New Microsoft Publisher Document.pub");
//		File f[] = folder.listFiles();
//		
//		for(int i =0;i<f.length;i++)
//		{
//			f[i].delete();
//		}
//		file 
		
		file.delete();
		file1.delete();
		file2.delete();	
		System.out.println(" Three file has been deleted");
		
	}
}
