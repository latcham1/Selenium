package vceguide;

public class Q133 {
	public static void main(String[] args) {
		int x = 5;
		while (isAvailable(x)) {
		System.out.print(x);
		x--;
		}
		}
		static Boolean isAvailable(int x){
		return x-->0 ? true :false;
		}
}
