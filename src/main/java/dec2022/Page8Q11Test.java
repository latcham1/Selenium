package dec2022;

public class Page8Q11Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Page8Q11Test ts = new Page8Q11Test();
		System.out.println(isAvailable+" ");
		isAvailable=ts.doStuff();
		System.out.println(isAvailable);
	}
	public static boolean doStuff()
	{
		return !isAvailable;
	}
	static boolean isAvailable=true;
}
