package dec2022;

class Base{
	public void test()
	{
		System.out.println("Base");
	}
}
class	DerivedA extends Base
{
	public void test()
	{
		System.out.println("DerivedA");
	}
}
class	Page13DerivedB extends DerivedA
{
	public void test()
	{
		System.out.println("DerivedB");
	}
	public static void main(String[] args) {
		Base b1 = new Page13DerivedB();
		Base b2 = new DerivedA();
		Base b3 = new Page13DerivedB();
//		System.out.println("---------------understanding puppose------------------");
//		b1.test();
//		b2.test();
//		b3.test();
//		System.out.println("---------Ans-----------------------");
//		Base b4=b3;
//		b1=(Base)b2;
//		b4.test();
//		b1.test();				
//		System.out.println("--------------understand purpose-------------------");
//		b1.test();
//		b2.test();
//		b3.test();
//		b4.test();
		System.out.println("----------another qn ans-----------------------");
		b1=(Base)b3;
		Base b4=(DerivedA)b3;	
		b1.test();
		b4.test();	
	}
}



