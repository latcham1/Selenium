package codereview;

public class Solution {
	public static boolean isPrime(int num) {
		boolean flag = false;
			for (int i = 2; i < num/2; i++) {
	if (num%i==0)
		 flag = true;
    }
			return flag;
	}       	
public static void main(String[] args) {
	int num =7;
boolean flag = false;
flag = Solution.isPrime(num);
if (!flag)
	System.out.println(num + " is a prime number.");
else
	System.out.println(num + " is not a prime number.");
		}
}
