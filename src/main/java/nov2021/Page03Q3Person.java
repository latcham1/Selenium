package nov2021;

public class Page03Q3Person 
{

	String name;
	int age = 25;

	public Page03Q3Person(String name)
	{
		this();       //line n1
		setName(name);
	}

	public Page03Q3Person(String name, int age) 
	{
		Page03Q3Person(name);    //line n2
		setAge(age);
	}

	public String show() {
		return name + " "  + age ;
		}


	public static void main(String[] args)
	{
		Page03Q3Person pl = new Page03Q3Person("Jesse");
		Page03Q3Person p2 = new Page03Q3Person("Walter", 52);
		System.out.println(pl.show());
		System.out.println(p2.show());
	}
}
