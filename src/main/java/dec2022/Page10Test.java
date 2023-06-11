package dec2022;

import java.util.ArrayList;
import java.util.List;
class Patient{
	String name;
	public Patient (String name)
	{
		this.name=name;
	}
}
public class Page10Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List ps = new ArrayList();
Patient p2=new Patient("Mike");
ps.add(p2);
int f=ps.indexOf(p2);   // new code
System.out.println(f);
if (f>=0)
	System.out.println("Mike Found");
	}
}
