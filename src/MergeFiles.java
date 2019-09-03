import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MergeFiles {
	
	public static void merge() throws IOException{
		
	File file=new File("C:/FileHandling/SplitFile");
	String files[]=file.list();
	FileOutputStream fos=new FileOutputStream("C:/FileHandling/Merge.txt",true);
	for(String Filename:files){
		FileInputStream fis=new FileInputStream("C:/FileHandling/SplitFile/"+Filename);
		byte b[]=new byte[fis.available()];
		fis.read(b);
		fos.write(b);
		fis.close();
	}
	fos.close();
	System.out.println("Files Merged");
	}
	public static void main(String[] args) throws IOException{
		merge();
	}
}
