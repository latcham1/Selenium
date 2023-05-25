package everyday;

public class FirstLetterToAppearTwice11 {
	public char repeatedCharacter(String s) {
	    int cnt[]= new int[26];
	    for(char ch:s.toCharArray()) if(++cnt[ch-'a']==2) return ch;
	    return 'a';
	}
	public static void main(String[] args) {
		FirstLetterToAppearTwice11 AppearTwice = new FirstLetterToAppearTwice11();
		AppearTwice.repeatedCharacter("abccbaacz");
		AppearTwice.repeatedCharacter("abcdd");
		System.out.println("AppearTwice :  " + AppearTwice.repeatedCharacter("abccbaacz"));
		System.out.println("AppearTwice:  " + AppearTwice.repeatedCharacter("abcdd"));
	}
}
