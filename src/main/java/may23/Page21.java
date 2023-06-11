package may23;
class vehicle1
{
	int x;
	vehicle1()
	{
		this(10);
	}
	vehicle1(int x)
	{
		this.x=x;
	}
}
class Car1 extends vehicle1
{
	int y;
	Car1()
	{		
		super(10);		
	}
	Car1(int y)
	{
		super(y);
		this.y=y;
	}
	public String toString()
	{
		return super.x+";" + this.y;
	}
}
public class Page21
{
	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		vehicle1 y=new Car1(20);
		System.out.println(y);
	}
}
