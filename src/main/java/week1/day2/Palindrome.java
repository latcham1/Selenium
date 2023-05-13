package week1.day2;


public class Palindrome {
public static void main(String[] args) {
	String str ="madam", reverseStr = "";
	for (int i = str.length()-1; i >= 0; --i) {
		
		 reverseStr = reverseStr + str.charAt(i);
		
	}
	 if (str.equalsIgnoreCase(reverseStr)) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
}
}
