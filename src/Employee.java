import java.io.Serializable;

public class Employee implements Serializable{

	private int eno=0,sal=0;
	private String ename,desg,dept;
	
	public Employee(int eno, int sal, String ename, String desg, String dept) {
		super();
		this.eno = eno;
		this.sal = sal;
		this.ename = ename;
		this.desg = desg;
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", sal=" + sal + ", ename=" + ename + ", desg=" + desg + ", dept=" + dept + "]";
	}


	

}
