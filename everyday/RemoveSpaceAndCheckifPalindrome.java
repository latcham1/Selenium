package everyday;

public class RemoveSpaceAndCheckifPalindrome {
	public static void main(String[] args) {
		String s = "A man, a plan, %^(^&*^&*$%#$^# a canal: Pan!@#$%^&*()ama";
		String rev="";
		  s = s.replaceAll(
		          "[^a-zA-Z0-9]", "");
		  
		  String str= s.toLowerCase();
		  System.out.println(str);
		  char[] ch = str.toCharArray();
		  for (int i = ch.length-1; i >-1; i--) {
			   rev=rev+ch[i];
					}
		  System.out.println(rev);
		  if (str.equals(rev))
			  System.out.println("Palindrome");
		  else
			  System.out.println("Not Palindrome");
	}
	

}
