import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Rename {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file names");
		System.out.println("First File:- ");
		String path1 = sc.nextLine();
		System.out.println("Second File:- ");
		String path2 = sc.nextLine();
		File f1 = new File(path1);
		File f2 = new File(path2);
		FileInputStream fis=new FileInputStream(path1);
		if (f1.isFile() && fis.available()<500) 
		{
			while (true) 
			{
				if (f2.isFile()) {
					System.out.println("2nd filename already exist.");
					System.out.println("Enter the 2nd file name again");
					path2 = sc.nextLine();
					f2 = new File(path2);
				} 
				else
					if(f1.renameTo(f2)){
				System.out.println("Name Changed from  "+f1+ "   to   " +f2);
					break;
					}
					else
						System.out.println("Name not changed");
				sc.close();
						System.exit(0);
			}
		}
		else 
		
		System.out.println("File 1 is not Renameable OOPsss Try Again");
		fis.close();
		sc.close();
		System.exit(0);
	}

}
