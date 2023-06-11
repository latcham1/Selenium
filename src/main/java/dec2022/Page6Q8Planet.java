package dec2022;

public class Page6Q8Planet
{
	public String name ;
	public int moons;
	Page6Q8Planet(String name,int moons)
	{
		this.name=name;
		this.moons=moons;
	}

	public static void main(String[] args) 
	{
		Page6Q8Planet planets[]=
			{
					new Page6Q8Planet("Mercury",0),
					new Page6Q8Planet("Venus",0),
					new Page6Q8Planet("Earth",1),
					new Page6Q8Planet("Mars",2)
			};
		System.out.println(planets);    //object memory location
		System.out.println(planets[2]);   //second memory values
		System.out.println(planets[2].moons);   //second memory values
System.out.println("--------------------");
		System.out.println(planets[0].moons);   //second memory values
		System.out.println(planets[1].moons);   //second memory values
		System.out.println(planets[2].moons);   //second memory values
		System.out.println(planets[3].moons);   //second memory values
	}
}