package may23;
class A{
	public void test()
	{
		System.out.println("A");
	}
}
class B extends A
{
	public void test()
	{
		System.out.println("B");
	}
}
public class Page36Q161ClassC extends A
{
	public void test()
	{
		System.out.println("C");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		A b1= new A();
		A b2= new Page36Q161ClassC();
		A b3=(B) b2;
		b1=(A) b2;
	
		
		b1.test();
		b3.test();


	}

}
