package may23;

public class Page04 {
	public int amount;
	public Page04 (int amount) {
		this.amount=amount;
	}
	public int getAmount() {
		return amount;
	}
	public void changeAmount (int x) {
		amount +=x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Page04 acct = new Page04((int)(Math.random()*1000));
//		acct.amount=0;
//		acct.changeAmount(-acct.amount);
		acct.changeAmount(-acct.getAmount());
		System.out.println(acct.getAmount());
	}
}
