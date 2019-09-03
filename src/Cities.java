import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Cities {
	
public static void main(String[] args) throws IOException{
	
	FileOutputStream fos= new FileOutputStream("C:/FileHandling/Cities.txt", true);
	System.out.println("How many cities you want to enter");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	sc.nextLine();
	while(i>0)
	{
		System.out.println("Enter the city name");
	    String s=sc.nextLine();
	    byte a=' ';
	    byte b[]= s.getBytes();
	    fos.write(b);
	    fos.write(a);
	    i--;
	    System.out.println("Name added");
	}
	System.out.println("Insertion complete");
sc.close();fos.close();
}
}
