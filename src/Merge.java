import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Merge {

	public static void main(String[] args) throws IOException {
   FileInputStream fis=new FileInputStream("C:/FileHandling/newgame.txt");
   FileInputStream fis1=new FileInputStream("C:/FileHandling/oldgame.txt");
   SequenceInputStream sis=new SequenceInputStream(fis,fis1);
   int j;
   while((j=sis.read())!=-1){
	   System.out.print((char)j);
   }
   sis.close();
   fis.close();
   fis1.close();
	}

}
