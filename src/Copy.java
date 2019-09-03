import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Copy {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the file names");
		System.out.println("FIRST file whose data you want to copy");
		Scanner sc=new Scanner(System.in);
		String f1=sc.nextLine();
		System.out.println("Second file in which you want to copy");
		String f2=sc.nextLine();
		FileInputStream fis=new FileInputStream(f1);
		byte b[]=new byte[fis.available()];
		fis.read(b);
		FileOutputStream fos=new FileOutputStream(f2);
		fos.write(b);
		System.out.println("Data Copied");
		sc.close();
		fis.close();
		fos.close();
	}

}
