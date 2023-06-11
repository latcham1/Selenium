package nov2021;

abstract class Planet
{
	protected void revolve()    // line 1
	{		
	}
	abstract void rotate();  // line 2

}
class Earth extends Planet
{
	public  void revolve()  // line 3   // public or protected are working good here
		{
		
	}
	protected void rotate()   // line 4
	{
		
	}
}