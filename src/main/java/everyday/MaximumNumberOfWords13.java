package everyday;
public class MaximumNumberOfWords13 {
	 public int mostWordsFound(String[] sentences) {
	        int ans = 0;
	        for (String s : sentences) {
	            int cnt = 1;
	            for (int i = 0; i < s.length(); ++i) {
	                if (s.charAt(i) == ' ') {
	                    ++cnt;
	                }
	            }
	            ans = Math.max(ans, cnt);
	        }
	        return ans;
	    }
	 public static void main(String[] args) {		 
		 String[] sentences1 = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		 String[] sentences2 = {"please wait", "continue to fight", "continue to win"};		
		 MaximumNumberOfWords13 maxnum = new MaximumNumberOfWords13();
		 int result1 = maxnum.mostWordsFound(sentences1);
		 int result2 = maxnum.mostWordsFound(sentences2);		 
		 System.out.println("maximum number of words that appear in a single sentence"  + result1);
		 System.out.println("maximum number of words that appear in a single sentence"  + result2);		 
	}
}
