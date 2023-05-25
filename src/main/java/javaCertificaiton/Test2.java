package javaCertificaiton;

public class Test2 {
	public static final int min=1;
	public static void main(String[] args) {
		int x=args.length;
		System.out.println(x);
		if (checkLimit (x)) {
			System.out.println("java se");
		}
			else
			{
				System.out.println("java ee");
			}
		}
	
	static boolean checkLimit (int x) {
		return (x>=min)? true : false;

	}
}
