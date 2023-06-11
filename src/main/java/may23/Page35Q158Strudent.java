package may23;
class Students
{
	String name;
	public Students (String name)
	{
		this.name=name;
	}
}

public class Page35Q158Strudent {
public static void main(String[] args) {
	Students[]  studs= new Students[3];
//	studs[0]  = new Students ("Bob");
	studs[1]  = new Students ("Richard");
	studs[2]  = new Students ("Donald");
	for (Students s : studs) {
		System.out.println(" " + s.name);
	}
}
}
