package vceguide.p2;

public class Q132
{
	void readCard(int cardNo) throws Exception
	{
		System.out.println("Read card");
	}
	void checkCard(int cardNo) throws RuntimeException
	{                                                        //line 1
		System.out.println("Check card");
	}
	public static void main(String[] args) throws Exception 
	{
		int cardNo=12344;
		Q132 ex = new Q132();
		ex.checkCard(cardNo);   // line2
		 ex.readCard(cardNo); //line 3   //not compile u have to put throws Exception in main method (declare or handel check Exception )
	}
}