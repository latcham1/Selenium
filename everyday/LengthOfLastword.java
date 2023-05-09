package everyday;

import java.util.Scanner;

public class LengthOfLastword {
	public static void main(String[] args) {
//		String s = "   fly me   to   the moon  ";
		System.out.println("enter line of word");
		Scanner myobj= new Scanner(System.in);
		String s = myobj.nextLine();
				int lenthOfLastWord=0;
		String str= s.trim();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
			{
				lenthOfLastWord=0;
			}
			else
			{
				lenthOfLastWord++;
			}
		}
		System.out.println(lenthOfLastWord);
	}
}