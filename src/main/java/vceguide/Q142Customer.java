package vceguide;

public class Q142Customer
{
	Q142ElectricAccount acct = new Q142ElectricAccount();
	public void useElectricity(double kwh)
	{
		acct.addkwh(kwh);
	}
}
public class Q142ElectricAccount
{
	private double kwh;
	private double rate =0.07;
	private double bill;
	public void addkwh (double kwh)   //b
	{
		if (kwh>0)
		{
			this.kwh+=kwh;
			this.bill = this.kwh*this.rate;
		}
	}
//	private void addkwh(double kwn)
//	{
//		if (kwh>0)
//		{
//		this.kwh +=kwh;
//		this.bill = this.kwh*this.rate;
//		}
//	}
}