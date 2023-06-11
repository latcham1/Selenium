package vceguide.p2;

public class Q120
{
	 int ns;
	static int s;
	Q120(int ns)
	{
		if(s<ns)
		{
			s=ns;
			this.ns=ns;
		}
	}
	void doPrint()
	{
		System.out.println("ns "+ns+" "+ " s "+s);
	}
	public static void main(String[] args) 
	{
		Q120 ref1= new Q120(50);
		Q120 ref2= new Q120(125);
		Q120 ref3= new Q120(100);//it is not true in if 100<125 not true so ns =0 s 125
		ref1.doPrint();
		ref2.doPrint();	
		ref3.doPrint();		
	}
}

