package may23;

public class Page46Test {
	static int count=0;
	int i=0;
	public void changeCount() {
		while (i<5){
			i++;
			count++;
		}
	}
	public static void main(String[] args) {
		Page46Test check1= new Page46Test();
		Page46Test check2 = new Page46Test();
		check1.changeCount();
		check2.changeCount();
		System.out.println(count+":"+count);
	}
}

