package may23;

class Vehicle
{
	String type = "4W";
	int maxSpeed=100;

	Vehicle(String type, int maxSpeed)
	{
		this.type=type;
		this.maxSpeed=maxSpeed;
	}
}
class car extends vehicle
{
	String trans;

	car (String trans);
	{
		this.trans=trans;        // line n2
	}



	car (String type, int maxspeed, String trans)
	{
		super (type, maxspeed);
		this(trans);              //line n2
	}
}
public class Page30Q135 {
	public static void main(String[] args) {
		car c1= new car ("Auto");
		car c2= new car ("4W", 150, "Manual");
		System.out.println(c1.type);+" "+c1.maxspeed +" "+c1.trans);
		System.out.println(c2.type);+" "+c2.maxspeed +" "+c2.trans);
	}
}