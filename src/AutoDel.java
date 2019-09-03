import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class AutoDel {

	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter a file name");
		Scanner sc= new Scanner(System.in);
		String file=sc.nextLine();
		FileInputStream fis=new FileInputStream(file);
		int j;
		while((j=fis.read())!=-1){
			System.out.print((char)j);
		}
		File f=new File(file);
		f.delete();
		sc.close();
		fis.close();
	}
	
}
