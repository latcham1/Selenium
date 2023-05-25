package everyday;

public class FirstNonRepeatingCharacter {
	public static int firstUniqChar(String s) {
		L: for (int i = 0, length = s.length(); i < length; i++) {
			for (int j = 0; j < length; j++)
				if (i != j && s.charAt(i) == s.charAt(j))
					continue L;
			return i;
		}
		return -1;
	}


	public static void main(String[] args) {
		System.out.println("First non-repeating character index :" + firstUniqChar("leetcode"));
		System.out.println("First non-repeating character index " +firstUniqChar("loveleetcode"));
		System.out.println("First non-repeating character index " +firstUniqChar("aabb"));
	}
} 