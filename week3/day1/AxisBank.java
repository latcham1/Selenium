package week3.day1;

public class AxisBank extends BankInfo{
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposit from AxisBank");
		super.deposit();
	}
	public static void main(String[] args) {
		AxisBank axix = new AxisBank();
		axix.deposit();
		axix.fixed();
		axix.saving();
		BankInfo bank = new BankInfo();
		bank.deposit();
	}
}
