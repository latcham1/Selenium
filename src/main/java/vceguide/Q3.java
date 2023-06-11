package vceguide;
class vehicle
{
	int x;
	vehicle()
	{
		this(10);    //line 1
	}
	vehicle(int x)
	{
		this.x=x;
	}
}
class Car extends vehicle
{
	int y;
	Car()
	{		
		super();	  //line 2
		this(20);
	}
	Car(int y)
	{
		super(y);
		this.y=y;
	}
	public String toString()
	{
		return super.x+":" + this.y;
	}
}
public class Q3 {

	public static void main(String[] args) {// TODO Auto-generated method stub
		vehicle y=new vehicle();
		System.out.println(y);
	

	}
}
