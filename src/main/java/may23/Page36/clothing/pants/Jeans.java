package may23.Page36.clothing.pants;
import may23.Page36.clothing.*;
public class Jeans 
{
public void matchShirt()
{
	String color = Shirt.getcolor();

	if (color.equals("Green"))
	{
		System.out.println("Fit");
	}
}
public static void main(String[] args) {
	Jeans trouser =new Jeans();
	trouser.matchShirt();
}
}