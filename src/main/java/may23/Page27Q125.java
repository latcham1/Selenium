package may23;


	abstract class A3 //A
	{private static int i;
	public void doStuff(){}public A3(){}}
	
	final class A1  //B
	{public A1(){}}
	
	public class Page27Q125   //C
	{private static int i;private Page27Q125(){}}
	
	class A4   //D  Final fields must be initialized immediately after declaration.
	{
	protected static final int i;
	private void doStuff(){}}
	
	final abstract class A5   //E   Abstract class can never be final.
	{
		protected static int i;
		void doStuff(){}
		abstract void doIt();
		}

