package week1.day2;

public class ReverseString {
	public static void main(String[] args) {
		String str="Test Leaf";
		
		
			
		
		char[] ch = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
