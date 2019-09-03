import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ThreeDGame {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 For New Game");
		System.out.println("Enter 2 to Resume Previous Game");
		int i=sc.nextInt();
		System.out.println("X-Plane Move");
		int X=sc.nextInt();
		System.out.println("Y-Plane Move");
		int Y=sc.nextInt();
		System.out.println("Z-Plane Move");
		int Z=sc.nextInt();
		PlayGame pg=null;
		
		if(i==1){
			pg=new PlayGame();
		}else{
			
			FileInputStream	fis=new FileInputStream("C:/FileHandling/prevgame.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			pg=(PlayGame) ois.readObject();
			
		}
		pg.movex(X);
		pg.movey(Y);
		pg.movez(Z);
		pg.showpt();
		
		System.out.println("Saving Game...");
		
		FileOutputStream fos=new FileOutputStream("C:/FileHandling/prevgame.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(pg);
		oos.close();fos.close();
		System.out.println("Thank you For Playing Game");
		System.out.println("        END       ");
		
		
		
		
	}

}
