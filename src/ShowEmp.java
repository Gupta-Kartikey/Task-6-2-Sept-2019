import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ShowEmp {

public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		
		FileInputStream fis = new FileInputStream("C:/FileHandling/newgame");
		ObjectInputStream ois =new ObjectInputStream(fis);
		Employee e3=(Employee) ois.readObject();
		Employee e4=(Employee) ois.readObject();
		System.out.println(e3);
		System.out.println(e4);
		fis.close();
		ois.close();
		
		
	}
}
