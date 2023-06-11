package fromRamDump;

public class Test4 {

	static int count=0;
	int i=0;
	public void changeCount() {
		while (i<5){
			i++;
			count++;
		}
	}
	public static void main(String[] args) {
		Test4 check1= new Test4();
		Test4 check2 = new Test4();
check1.changeCount();
	check2.changeCount();
		System.out.println(count+":"+count);
	}


}

