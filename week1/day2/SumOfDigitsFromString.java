package week1.day2;

public class SumOfDigitsFromString {
	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int i = 0,sum =0;
		char c[] = text.toCharArray();
		int len = c.length;
		while(i<len){
			if((c[i] >= '0') && (c[i]) <='9'){
				sum = (sum + c[i] - '0');
			}
			i++;
		}
		System.out.println(sum);
	}
}