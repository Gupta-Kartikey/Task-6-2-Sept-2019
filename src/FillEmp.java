import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FillEmp {

	public void Fill() throws IOException{
	Employee e1=new Employee(1, 36748392, "Kartikey", "CEO", "Head");
	Employee e2=new Employee(2, 7663738, "Vishnu", "TL", "Head");
	System.out.println(e1);
	System.out.println(e2);
	System.out.println("Saving object to file...");
	FileOutputStream fos=new FileOutputStream("C:/FileHandling/newgame");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(e1);
	oos.writeObject(e2);
	oos.close();
	fos.close();
}
}
