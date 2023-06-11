package nov2021;

public class Page17Q57 
{
	String myStr = "7007";
	void doStaff(String str)
	{
		int myNum = 0;
		try
		{
			String myStr=str;//new variable
			System.out.println(myStr);
			myNum=Integer.parseInt(myStr);
			System.out.println(myStr);
		}catch(NumberFormatException e)
		{
			System.out.println("Error");
		}
		System.out.println(myStr);
		System.out.println("myStr="+myStr + " ," +"myNum="+ myNum);//7007 ,9009
	}
	public static void main(String[] args)
	{
		Page17Q57 app = new Page17Q57();
		app.doStaff("9009");
	}
}
