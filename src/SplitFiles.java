import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SplitFiles {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file you want to Split");
		String f1=sc.nextLine();
		System.out.println("No. of files into which you want split");
		int i=sc.nextInt();
		sc.nextLine();
		FileInputStream fis =new FileInputStream(f1);
		int j=fis.available()/i;
		int k=0;
		FileOutputStream fos=null;
		File f=new File("C:/FileHandling/SplitFile");
		f.mkdir();
		byte b[]=new byte[j];
		while(k<i){
			fis.read(b);
		    fos=new FileOutputStream("C:/FileHandling/SplitFile/file"+k+".txt");
			k++;
			fos.write(b);
		}
		fis.read(b);
		fos.write(b);
		fis.close();
		sc.close();
		
		}

}
