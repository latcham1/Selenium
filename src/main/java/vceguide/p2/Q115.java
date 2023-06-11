package vceguide.p2;

public class Q115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Duke");
		String str1 = sb.toString();
		String str2 = str1;
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1);
		System.out.println(str2);
		}
	}


