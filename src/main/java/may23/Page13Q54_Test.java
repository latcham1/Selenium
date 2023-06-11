package may23;
class Page13Q54_Test
{
	int a1;

	public static void doProduct(int a) 
	{
		a=a*a;
	}
	public static void doString(StringBuilder s)
	{
		s.append(" "+s);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Page13Q54_Test item = new Page13Q54_Test();
		item.a1=11;
		StringBuilder sb = new StringBuilder("Hello");
		Integer i=10;
		System.out.println(i+" "+sb+" "+item.a1); //10 Hello 11
		doProduct(i);  //121
		System.out.println(i+" "+sb+" "+item.a1); //10 Hello 11
		doString(sb);   //Hello
		System.out.println(i+" "+sb+" "+item.a1); //10 Hello Hello 11
		doProduct(item.a1);  //121
		System.out.println(i+" "+sb+" "+item.a1);  //10 Hello Hello 11
	}

}
