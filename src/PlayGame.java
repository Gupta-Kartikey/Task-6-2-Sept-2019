import java.io.Serializable;

public class PlayGame implements Serializable {
	private int x=0, y=0, z=0;
	
	public void movex(int xpt){
		x=x+xpt;
	}
	public void movey(int ypt){
		y=y+ypt;
	}
	public void movez(int zpt){
		z=z+zpt;
	}
	public void showpt(){
		System.out.println("Current Position : X:- " +x+" Y:- "+y+" Z:- "+z);
	}
	
}
